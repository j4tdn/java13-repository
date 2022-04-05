package stockmanagement.allocation;

import stockmanagement.model.DataModel;
import stockmanagement.utils.PrintUtils;
import stockmanagement.utils.StoreUtils;

import java.math.RoundingMode;
import java.util.*;


public class StoreService {
    public static void main(String[] args) {
        final Integer whAllocationAmount = 299;
        final List<Store> stores = DataModel.getStores();
        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);
        PrintUtils.printMap(storeAllocatedAmounts, "Result: ");
    }

    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        // TODO: YOUR WORK
        // Step 1: Filling in missing expected sales
        stores.stream().filter(store -> store.getExpectedSales() == null)
                .forEach(store -> {
                    if (store.getReferenceStoreId() == null) {
                        store.setExpectedSales(StoreUtils.getExpectedSalesAverage(stores));
                    } else {
                        if (!StoreUtils.referenceStoreContainReferenceStoreId(stores, store.getReferenceStoreId())) {
                            store.setExpectedSales(StoreUtils.getExpectedSales(store, stores));
                        } else {
                            store.setExpectedSales(StoreUtils.getExpectedSalesAverage(stores));
                        }
                    }
                });
        PrintUtils.printList(stores, "Filling in missing expected sales: ");
        // Step 2: Calculate Allocation Key
        Map<Long, Double> allocationKeys = new HashMap<>();
        stores.forEach(store ->
                allocationKeys.put(store.getStoreId(),
                        store.getExpectedSales()
                                .divide(StoreUtils.getSumExpectedSales(stores), 10, RoundingMode.HALF_EVEN)
                                .doubleValue()));
        PrintUtils.printMap(allocationKeys, "Calculate Allocation Key: ");

        // Step 3: Calculate Allocated Amount
        Map<Long, Integer> allocationAmounts = new HashMap<>();
        stores.forEach(store ->
                allocationAmounts.put(store.getStoreId(),
                        StoreUtils.getAllocationAmount(allocationKeys.get(store.getStoreId()), whAllocationAmount, stores, store)));
        PrintUtils.printMap(allocationAmounts, "Calculate Allocated Amount: ");

        // Step 4: Fix rounding issue
        Map<Long, Integer> demandStore = new HashMap<>();
        stores.forEach(store -> demandStore.put(store.getStoreId(), StoreUtils.getDemandStore(store)));
        PrintUtils.printMap(demandStore, "Demand Stores: ");

        Map<Long, Integer> differenceAmountAllocatedAndDemand = new HashMap<>();
        stores.forEach(store -> differenceAmountAllocatedAndDemand.put(store.getStoreId(),
                StoreUtils.getDifference(allocationAmounts, demandStore, store)));
        PrintUtils.printMap(differenceAmountAllocatedAndDemand, "Diffence Amount Allocated And Demand: ");

        if (StoreUtils.getAmountsAllocatedStore(allocationAmounts) > whAllocationAmount) {
           while (!StoreUtils.getAmountsAllocatedStore(allocationAmounts).equals(whAllocationAmount)) {
                int biggestDifference = StoreUtils.getBiggestDifference(differenceAmountAllocatedAndDemand, stores, demandStore);
                Long storeIDWithMaxDifference = Objects.requireNonNull(differenceAmountAllocatedAndDemand
                        .entrySet().stream()
                        .filter(x -> x.getValue() == biggestDifference).findFirst().orElse(null)).getKey();
                allocationAmounts.put(storeIDWithMaxDifference, allocationAmounts.get(storeIDWithMaxDifference) - 1);
            }
        }

        if (StoreUtils.getAmountsAllocatedStore(allocationAmounts) < whAllocationAmount){
            while (!StoreUtils.getAmountsAllocatedStore(allocationAmounts).equals(whAllocationAmount)) {
                int smallestDifference = StoreUtils.getSmallestDifference(differenceAmountAllocatedAndDemand, stores, demandStore);
                Long storeIDWithMaxDifference = Objects.requireNonNull(differenceAmountAllocatedAndDemand
                        .entrySet().stream()
                        .filter(x -> x.getValue() == smallestDifference).findFirst().orElse(null)).getKey();
                allocationAmounts.put(storeIDWithMaxDifference, allocationAmounts.get(storeIDWithMaxDifference) + 1);
            }
        }
        return new HashMap<>(allocationAmounts);
    }

}

package stockmanagement.allocation;

import stockmanagement.model.DataModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class StoreService {
    public static void main(String[] args) {
        final Integer whAllocationAmount = 300;
        final List<Store> stores = DataModel.getStores();
        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);
        printMap(storeAllocatedAmounts, "Result: ");
    }

    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        // TODO: YOUR WORK
        // Step 1: Filling in missing expected sales
        stores.stream().filter(store -> store.getExpectedSales() == null)
                .forEach(store -> {
                    if (store.getReferenceStoreId() == null) {
                        store.setExpectedSales(getAverage(stores));
                    } else {
                        if (!referenceStoreContainReferenceStoreId(stores, store.getReferenceStoreId())) {
                            store.setExpectedSales(getExpectedSales(store, stores));
                        } else {
                            store.setExpectedSales(getAverage(stores));
                        }
                    }
                });
        printList(stores, "Filling in missing expected sales: ");
        // Step 2: Calculate Allocation Key
        Map<Long, Double> allocationKeys = new HashMap<>();
        stores.forEach(store ->
                allocationKeys.put(store.getStoreId(),
                        store.getExpectedSales()
                                .divide(getSumExpectedSales(stores), 10, RoundingMode.HALF_EVEN)
                                .doubleValue()));
        printMap(allocationKeys, "Calculate Allocation Key: ");

        // Step 3: Calculate Allocated Amount
        Map<Long, Integer> allocationAmounts = new HashMap<>();
        stores.forEach(store ->
                allocationAmounts.put(store.getStoreId(),
                        getAllocationAmount(allocationKeys.get(store.getStoreId()), whAllocationAmount, stores, store)));
        printMap(allocationAmounts, "Calculate Allocated Amount: ");

        // Step 4: Fix rounding issue
        Map<Long, Integer> demandStore = new HashMap<>();
        stores.forEach(store -> demandStore.put(store.getStoreId(), getDemandStore(store)));
        printMap(demandStore, "Demand Stores: ");

        Map<Long, Integer> differenceAmountAllocatedAndDemand = new HashMap<>();
        stores.forEach(store -> differenceAmountAllocatedAndDemand.put(store.getStoreId(),
               getDifference(allocationAmounts, demandStore, store)));
        printMap(differenceAmountAllocatedAndDemand, "Diffence Amount Allocated And Demand: ");
        if (getAmountsAllocatedStore(allocationAmounts) > whAllocationAmount) {
           while (!getAmountsAllocatedStore(allocationAmounts).equals(whAllocationAmount)) {
                int biggestDifference = getBiggestDifference(differenceAmountAllocatedAndDemand, stores, demandStore);
               System.out.println("biggest Difference:" + biggestDifference);
                Long storeIDWithMaxDifference = Objects.requireNonNull(differenceAmountAllocatedAndDemand
                        .entrySet().stream()
                        .filter(x -> x.getValue() == biggestDifference).findFirst().orElse(null)).getKey();
                allocationAmounts.put(storeIDWithMaxDifference, allocationAmounts.get(storeIDWithMaxDifference) - 1);
            }
        }
        if (getAmountsAllocatedStore(allocationAmounts) < whAllocationAmount){
            while (!getAmountsAllocatedStore(allocationAmounts).equals(whAllocationAmount)) {
                int smallestDifference = getSmallestDifference(differenceAmountAllocatedAndDemand, stores, demandStore);
                System.out.println("smallest Difference:" + smallestDifference);
                Long storeIDWithMaxDifference = Objects.requireNonNull(differenceAmountAllocatedAndDemand
                        .entrySet().stream()
                        .filter(x -> x.getValue() == smallestDifference).findFirst().orElse(null)).getKey();
                allocationAmounts.put(storeIDWithMaxDifference, allocationAmounts.get(storeIDWithMaxDifference) + 1);
            }
        }
        return new HashMap<>(allocationAmounts);
    }
    private static Integer getDifference(Map<Long, Integer> allocationAmounts, Map<Long, Integer> demandStore, Store store){
        return Math.abs(allocationAmounts.get(store.getStoreId()) - demandStore.get(store.getStoreId()));
    }
    private static Integer getBiggestDifference(Map<Long, Integer> differenceAmountAllocatedAndDemand, List<Store> stores, Map<Long, Integer> demandStore) {
        Set<Map.Entry<Long, Integer>> entries = differenceAmountAllocatedAndDemand.entrySet();
        List<Map.Entry<Long, Integer>> sortedList = new ArrayList<>(entries);
        //Sorting based on difference
        sortedList.sort(((Comparator<Map.Entry<Long, Integer>>) (o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .thenComparing(o -> demandStore.get(o.getKey()))
                .thenComparing(o -> getStoreById(stores, o.getKey()).getExpectedSales())
                .thenComparing(Map.Entry::getKey));

        return sortedList.get(0).getValue();
    }

    private static Integer getSmallestDifference(Map<Long, Integer> differenceAmountAllocatedAndDemand, List<Store> stores, Map<Long, Integer> demandStore) {
        Set<Map.Entry<Long, Integer>> entries = differenceAmountAllocatedAndDemand.entrySet();
        List<Map.Entry<Long, Integer>> sortedList = new ArrayList<>(entries);
        //Sorting based on difference
        sortedList.sort(((Comparator<Map.Entry<Long, Integer>>) (o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .thenComparing((o1, o2) -> demandStore.get(o2.getKey()).compareTo(demandStore.get(o1.getKey())))
                .thenComparing((o1, o2) -> getStoreById(stores, o2.getKey()).getExpectedSales().compareTo(getStoreById(stores, o1.getKey()).getExpectedSales()))
                .thenComparing(Map.Entry.comparingByKey()));
        return sortedList.get(0).getValue();
    }

    private static Store getStoreById(List<Store> stores, Long idStore) {
        return stores.stream().filter(store -> store.getStoreId().equals(idStore)).findFirst().orElse(null);
    }

    private static Integer getAmountsAllocatedStore(Map<Long, Integer> allocationAmounts) {
        return allocationAmounts.values().stream().reduce(Integer::sum).orElse(null);
    }

    private static Integer getDemandStore(Store store) {
        return Math.max((store.getExpectedSales().subtract(store.getStockPreviousDay())).intValue(), 0);
    }

    private static Integer getAllocationAmount(Double allocationKey, Integer whAllocationAmount, List<Store> stores, Store store) {
        double rs = allocationKey * (whAllocationAmount + getSumofStockPreviousDayofCheckedStore(stores).intValue()) - store.getStockPreviousDay().intValue();
        return Math.max((int) Math.round(rs), 0);
    }

    private static BigDecimal getSumofStockPreviousDayofCheckedStore(List<Store> stores) {
        return stores.stream().filter(Store::getSelected).map(Store::getStockPreviousDay).reduce(BigDecimal::add).orElse(null);
    }

    private static BigDecimal getSumExpectedSales(List<Store> stores) {
        return stores.stream().map(Store::getExpectedSales).reduce(BigDecimal::add).orElse(null);
    }

    private static BigDecimal getAverage(List<Store> stores) {
        double average =
                stores.stream().filter(store -> store.getExpectedSales() != null && store.getReferenceStoreId() == null)
                        .map(Store::getExpectedSales)
                        .mapToDouble(BigDecimal::doubleValue)
                        .average().orElse(0d);
        DecimalFormat df = new DecimalFormat("#.#");
        return BigDecimal.valueOf(Double.parseDouble(df.format(average)));
    }

    private static BigDecimal getExpectedSales(Store store, List<Store> stores) {
        return Objects.requireNonNull(stores.stream().filter(st -> st.getStoreId().equals(store.getReferenceStoreId())).findFirst().orElse(null)).getExpectedSales();
    }

    private static boolean referenceStoreContainReferenceStoreId(List<Store> stores, Long Id) {
        return Objects.requireNonNull(stores.stream().filter(store -> store.getStoreId().equals(Id)).findFirst().orElse(null)).getReferenceStoreId() != null;
    }

    private static <K, V> void printMap(Map<K, V> map, String message) {
        System.out.println(message);
        map.forEach((K, V) -> System.out.println(K + " - " + V));
        System.out.println("\n=================================================\n");
    }

    private static <K> void printList(List<K> list, String message) {
        System.out.println(message);
        list.forEach(System.out::println);
        System.out.println("\n=================================================\n");
    }
}

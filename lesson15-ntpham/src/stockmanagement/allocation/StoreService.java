package stockmanagement.allocation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import stockmanagement.model.DataModel;
import stockmanagement.ultil.StoreUtils;

public class StoreService {

    public static void main(String[] args) {
        // Step 1: Input
        final Integer whAllocationAmount = 300;
        final List<Store> stores = DataModel.getStores();
        final List<Store> slectedStores = stores.stream()
                .filter(store -> Boolean.TRUE.equals(store.getSelected()))
                .collect(Collectors.toList());

        if (stores.stream().allMatch(store -> Optional.ofNullable(store.getExpectedSales()).isPresent())) {
            throw new RuntimeException("Expected sales cannot be calculated. Please add a " +
                    "reference store or include stores with expected sales for interpolation");
        }
        // Step 2: Do calculation
        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, slectedStores);

        // Step 4: Print out result
        storeAllocatedAmounts.entrySet().forEach(System.out::println);
    }

    /**
     * Do Allocation.
     *
     * return map of -> Key: storeId with Long type
     *               -> Value: storeAllocatedAmount after calculation with 4 steps
     *
     * @return map of storeId, storeAllocatedAmount
     */
    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        // TODO: YOUR WORK
        Map<Long, Integer> fixedAllocatedAmountMap = new HashMap<>();

        // Step 1: Filling in missing expected sales
        fillingMissingExpectedSales(stores);

        // Step 2: Calculate Allocation Key
        calculateAllocationKey(stores);

        // Step 3: Calculate Allocated Amount
        calculateAllocatedAmount(stores,whAllocationAmount);

        // Step 4: Fix rounding issue
        fixRoundingIssue(stores, whAllocationAmount);

        for (Store store : stores) {
            fixedAllocatedAmountMap.put(store.getStoreId(), store.getAmountAllocated());
        }
        return fixedAllocatedAmountMap;
    }

    private static <T> List<T> getStore(List<T> stores, Predicate<T> predicate) {
        return stores.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static BigDecimal calculateAverageExpectedSales(Collection<Store> stores) {
        return StoreUtils.sum(stores, Store::getExpectedSales)
                .divide(BigDecimal.valueOf(stores.size()), 1, RoundingMode.HALF_UP);
    }

    private static void fillingMissingExpectedSales(List<Store> stores) {
        Map<Long, Store> noMissingExpectedSalesStoresMap = stores.stream()
                .filter(store -> Optional.ofNullable(store.getExpectedSales()).isPresent())
                .collect(Collectors.toMap(Store::getStoreId, Function.identity()));
        List<Store> missingExpectedSalesStores =
                getStore(stores, store -> !Optional.ofNullable(store.getExpectedSales()).isPresent());
        for (Store store : missingExpectedSalesStores) {
            if ( Optional.ofNullable(store.getReferenceStoreId()).isPresent() &&
                    noMissingExpectedSalesStoresMap.containsKey(store.getReferenceStoreId())) {
                store.setExpectedSales(
                        noMissingExpectedSalesStoresMap.get(store.getReferenceStoreId()).getExpectedSales());
                continue;
            }
            store.setExpectedSales(calculateAverageExpectedSales(noMissingExpectedSalesStoresMap.values()));
        }
    }

    private static List<Store> calculateAllocationKey(List<Store> stores) {
        BigDecimal sumExpectedSalesStore = StoreUtils.sum(stores, Store::getExpectedSales);
        for (Store store : stores) {
            store.setAllocationKey(store.getExpectedSales()
                    .divide(sumExpectedSalesStore, 10, RoundingMode.HALF_UP));
        }
        return stores;
    }
    
    private static List<Store> calculateAllocatedAmount(List<Store> stores, Integer whAllocationAmount) {
        BigDecimal sumStockPreviousDaysStore = StoreUtils.sum(stores, Store::getStockPreviousDay);
        Integer amountAllocatedStore;
        for (Store store : stores) {
            amountAllocatedStore = store.getAllocationKey()
                    .multiply(BigDecimal.valueOf(whAllocationAmount).add(sumStockPreviousDaysStore))
                    .subtract(store.getStockPreviousDay())
                    .setScale(0, RoundingMode.HALF_UP)
                    .intValue();
            if(amountAllocatedStore.compareTo(0) <= 0) {
                amountAllocatedStore = 0;
            }
            store.setAmountAllocated(amountAllocatedStore);
        }
        return stores;
    }
    
    private static List<Store> calculateDemandStores(List<Store> stores) {
        Integer demand;
        for (Store store : stores) {
            demand = store.getExpectedSales().subtract(store.getStockPreviousDay())
                    .setScale(0, RoundingMode.UP).intValue();
            if (demand.compareTo(0) < 0) {
                demand = 0;
            }
            store.setDemand(demand);
        }
        return stores;
    }

    private static List<Store> fixRoundingIssue(List<Store> stores, Integer whAllocationAmount) {
        Integer sumAllocatedAmount;
        calculateDemandStores(stores);
        do {
            sumAllocatedAmount = StoreUtils.sum(stores, store -> BigDecimal.valueOf(store.getAmountAllocated()))
                    .intValue();
            if (sumAllocatedAmount.equals(whAllocationAmount)) {
                break;
            }
            Store store;
            if (sumAllocatedAmount > whAllocationAmount) {
                stores = sortedStore(stores, Comparator.naturalOrder());
                store = stores.get(0);
                store.setAmountAllocated(store.getAmountAllocated() - 1);
            }
            if (sumAllocatedAmount < whAllocationAmount) {
                stores = sortedStore(stores, Comparator.reverseOrder());
                store = stores.get(stores.size() - 1);
                store.setAmountAllocated(store.getAmountAllocated() + 1);
            }
        } while (true);
        return stores;
    }

    private static List<Store> sortedStore(List<Store> stores, Comparator<Long> storeComparator) {
        return stores.stream()
                .filter(store -> ! store.getAmountAllocated().equals(0))
                .sorted(Comparator.comparing(Store::different, Comparator.reverseOrder())
                        .thenComparing(Store::getDemand, Comparator.reverseOrder())
                        .thenComparing(Store::getAmountAllocated, Comparator.reverseOrder())
                        .thenComparing(Store::getStoreId, storeComparator))
                .collect(Collectors.toList());
    }
}
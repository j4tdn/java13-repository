package stockmanagement_old.utils;

import stockmanagement_old.allocation.Store;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class StoreUtils {
    private StoreUtils(){

    }
    public static Integer getDifference(Map<Long, Integer> allocationAmounts, Map<Long, Integer> demandStore, Store store){
        return Math.abs(allocationAmounts.get(store.getStoreId()) - demandStore.get(store.getStoreId()));
    }
    public static Integer getBiggestDifference(Map<Long, Integer> differenceAmountAllocatedAndDemand, List<Store> stores, Map<Long, Integer> demandStore) {
        Set<Map.Entry<Long, Integer>> entries = differenceAmountAllocatedAndDemand.entrySet();
        List<Map.Entry<Long, Integer>> sortedList = new ArrayList<>(entries);
        //Sorting based on difference
        sortedList.sort(((Comparator<Map.Entry<Long, Integer>>) (o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .thenComparing(o -> demandStore.get(o.getKey()))
                .thenComparing(o -> getStoreById(stores, o.getKey()).getExpectedSales())
                .thenComparing(Map.Entry::getKey));

        return sortedList.get(0).getValue();
    }

    public static Integer getSmallestDifference(Map<Long, Integer> differenceAmountAllocatedAndDemand, List<Store> stores, Map<Long, Integer> demandStore) {
        Set<Map.Entry<Long, Integer>> entries = differenceAmountAllocatedAndDemand.entrySet();
        List<Map.Entry<Long, Integer>> sortedList = new ArrayList<>(entries);
        //Sorting based on difference
        sortedList.sort(((Comparator<Map.Entry<Long, Integer>>) (o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .thenComparing((o1, o2) -> demandStore.get(o2.getKey()).compareTo(demandStore.get(o1.getKey())))
                .thenComparing((o1, o2) -> getStoreById(stores, o2.getKey()).getExpectedSales().compareTo(getStoreById(stores, o1.getKey()).getExpectedSales()))
                .thenComparing(Map.Entry.comparingByKey()));
        return sortedList.get(0).getValue();
    }

    public static Store getStoreById(List<Store> stores, Long idStore) {
        return stores.stream().filter(store -> store.getStoreId().equals(idStore)).findFirst().orElse(null);
    }

    public static Integer getAmountsAllocatedStore(Map<Long, Integer> allocationAmounts) {
        return allocationAmounts.values().stream().reduce(Integer::sum).orElse(null);
    }

    public static Integer getDemandStore(Store store) {
        return Math.max((store.getExpectedSales().subtract(store.getStockPreviousDay())).intValue(), 0);
    }

    public static Integer getAllocationAmount(Double allocationKey, Integer whAllocationAmount, List<Store> stores, Store store) {
        double rs = allocationKey * (whAllocationAmount + getSumofStockPreviousDayofCheckedStore(stores).intValue()) - store.getStockPreviousDay().intValue();
        return Math.max((int) Math.round(rs), 0);
    }

    public static BigDecimal getSumofStockPreviousDayofCheckedStore(List<Store> stores) {
        return stores.stream().filter(Store::getSelected).map(Store::getStockPreviousDay).reduce(BigDecimal::add).orElse(null);
    }

    public static BigDecimal getSumExpectedSales(List<Store> stores) {
        return stores.stream().map(Store::getExpectedSales).reduce(BigDecimal::add).orElse(null);
    }

    public static BigDecimal getExpectedSalesAverage(List<Store> stores) {
        double average =
                stores.stream().filter(store -> store.getExpectedSales() != null && store.getReferenceStoreId() == null)
                        .map(Store::getExpectedSales)
                        .mapToDouble(BigDecimal::doubleValue)
                        .average().orElse(0d);
        DecimalFormat df = new DecimalFormat("#.#");
        return BigDecimal.valueOf(Double.parseDouble(df.format(average)));
    }

    public static BigDecimal getExpectedSales(Store store, List<Store> stores) {
        return Objects.requireNonNull(stores.stream().filter(st -> st.getStoreId().equals(store.getReferenceStoreId())).findFirst().orElse(null)).getExpectedSales();
    }

    public static boolean referenceStoreContainReferenceStoreId(List<Store> stores, Long Id) {
        return Objects.requireNonNull(stores.stream().filter(store -> store.getStoreId().equals(Id)).findFirst().orElse(null)).getReferenceStoreId() != null;
    }


}

package stockmanagement.allocation;


import stockmanagement.model.DataModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static stockmanagement.model.DataModel.bd;

public class StoreService {

    public static void main(String[] args) {
        // Step 1: Input
        final Integer whAllocationAmount = 302;
        final List<Store> selectedStores = DataModel.getStores().stream().filter(Store::getSelected).collect(Collectors.toList());
        validation(selectedStores);

        // Step 2: Do calculation
        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, selectedStores);

        // Step 4: Print out result
        printMap(storeAllocatedAmounts, "Result: ");
    }

    private static Map<Long, Integer> doAllocation(Integer whAllocationAmount, List<Store> stores) {
        // TODO: YOUR WORK
        // Step 1: Filling in missing expected sales
        Map<Long, BigDecimal> filledExpectedSales = fillingMissingExpectedSales(stores);
        printMap(filledExpectedSales, "Filling in missing expected sales: ");

        // Step 2: Calculate Allocation Key
        Map<Long, BigDecimal> allocationKeyMap = calculateAllocationKey(filledExpectedSales);
        printMap(allocationKeyMap, "Calculate Allocation Key: ");

        // Step 3: Calculate Allocated Amount
        Map<Long, BigDecimal> stockPreviousDayMap = stores.stream().collect(Collectors.toMap(Store::getStoreId, Store::getStockPreviousDay));
        Map<Long, Integer> allocatedAmount = calculateAllocatedAmount(allocationKeyMap, whAllocationAmount, stockPreviousDayMap);
        printMap(allocatedAmount, "Calculate Allocated Amount: ");

        // Step 4: Fix rounding issue
        return fixRoundingIssues(whAllocationAmount, allocatedAmount, filledExpectedSales, stockPreviousDayMap);
    }

    private static void validation(List<Store> selectedStores) {
        if (selectedStores.size() == 0) {
            throw new IllegalArgumentException("There is no selected store!!!");
        }
        if (selectedStores.stream().allMatch(store -> store.getExpectedSales() == null)) {
            throw new IllegalArgumentException("Expected sales cannot be calculated. Please add a " +
                    "reference store or include stores with expected sales for interpolation");
        }
    }

    private static Map<Long, Integer> fixRoundingIssues(Integer whAllocationAmount, Map<Long, Integer> allocatedAmount, Map<Long, BigDecimal> expectedSales, Map<Long, BigDecimal> stockPreviousDayMap) {
        Integer getSumAllocatedAmount = getSumValues(allocatedAmount, 0, Integer::sum);

        System.out.println("getSumAllocatedAmount: " + getSumAllocatedAmount);
        Map<Long, Integer> fixedAllocatedAmount = new HashMap<>(allocatedAmount);
        Map<Long, Integer> demandMap = expectedSales.entrySet().stream()
                .collect(Collectors.toMap(Entry::getKey, entry -> findDemand(entry.getValue(), stockPreviousDayMap.get(entry.getKey()))));
        printMap(demandMap, "Demand: ");
        if (!getSumAllocatedAmount.equals(whAllocationAmount)) {
            if (getSumAllocatedAmount > whAllocationAmount) {
                while (!getSumAllocatedAmount.equals(whAllocationAmount)) {
                    subtractOneAllocation(demandMap, fixedAllocatedAmount, expectedSales);
                    getSumAllocatedAmount = getSumAllocatedAmount - 1;
                }
            } else {
                while (!getSumAllocatedAmount.equals(whAllocationAmount)) {
                    addOneAllocation(demandMap, fixedAllocatedAmount, expectedSales);
                    getSumAllocatedAmount = getSumAllocatedAmount + 1;
                }
            }
        }
        return fixedAllocatedAmount;
    }


    private static Map<Long, BigDecimal> fillingMissingExpectedSales(List<Store> stores) {
        Map<Long, BigDecimal> filledExpectedSales = new HashMap<>();
        List<Store> ownExpectedSalesStores = stores.stream().filter(store -> store.getExpectedSales() != null).collect(Collectors.toList());
        Map<Long, BigDecimal> ownExpectedSalesMap = ownExpectedSalesStores.stream().collect(Collectors.toMap(Store::getStoreId, Store::getExpectedSales));
        stores.forEach(
                store -> {
                    BigDecimal expectedSale = store.getExpectedSales();
                    /*
                      In case of:
                      store.getReferenceStoreId() = null
                      ownExpectedSalesMap.get(store.getReferenceStoreId() => null
                      => interpolated expected sale = average of own expected sales
                     */
                    if (expectedSale == null) {
                        if (ownExpectedSalesMap.get(store.getReferenceStoreId()) != null) {
                            expectedSale = ownExpectedSalesMap.get(store.getReferenceStoreId());
                        } else {
                            expectedSale = averageExpectedSales(ownExpectedSalesStores);
                        }
                    }
                    filledExpectedSales.put(store.getStoreId(), expectedSale);
                }
        );
        return filledExpectedSales;
    }

    private static Map<Long, BigDecimal> calculateAllocationKey(Map<Long, BigDecimal> filledExpectedSales) {
        return filledExpectedSales.entrySet().stream()
                .collect(Collectors.toMap(
                        Entry::getKey, entry -> entry.getValue().divide(getSumValues(filledExpectedSales, BigDecimal.ZERO, BigDecimal::add), 10, RoundingMode.HALF_UP)
                ));
    }

    private static Map<Long, Integer> calculateAllocatedAmount(Map<Long, BigDecimal> allocationKeyMap, Integer whAllocationAmount, Map<Long, BigDecimal> stockPreviousDayMap) {
        return allocationKeyMap.entrySet().stream().collect(Collectors.toMap(Entry::getKey, entry ->
                calculateAllocatedAmount(entry.getValue(), whAllocationAmount, getSumValues(stockPreviousDayMap, BigDecimal.ZERO, BigDecimal::add), stockPreviousDayMap.get(entry.getKey()))
        ));
    }

    private static Integer calculateAllocatedAmount(BigDecimal allocationKey, Integer whAllocationAmount, BigDecimal sumStockPreviousDay, BigDecimal stockPreviousDay) {
        return Math.max(allocationKey.multiply(bd(whAllocationAmount).add(sumStockPreviousDay))
                .subtract(stockPreviousDay).setScale(0, RoundingMode.HALF_UP).intValue(), 0);
    }

    private static void subtractOneAllocation(Map<Long, Integer> demandMap, Map<Long, Integer> allocatedAmount, Map<Long, BigDecimal> expectedSales) {
        Comparator<Entry<Long, Integer>> comparator = ((Comparator<Entry<Long, Integer>>) (o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .thenComparing(e -> demandMap.get(e.getKey()))
                .thenComparing(e -> expectedSales.get(e.getKey()))
                .thenComparing(Entry::getKey);
        Long storeId = getStoreIdToChange(demandMap, allocatedAmount, comparator);
        allocatedAmount.put(storeId, allocatedAmount.get(storeId) - 1);
    }

    private static void addOneAllocation(Map<Long, Integer> demandMap, Map<Long, Integer> allocatedAmount, Map<Long, BigDecimal> expectedSales) {
        Comparator<Entry<Long, Integer>> comparator = ((Comparator<Entry<Long, Integer>>) (e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .thenComparing((e1, e2) -> demandMap.get(e2.getKey()).compareTo(demandMap.get(e1.getKey())))
                .thenComparing((e1, e2) -> expectedSales.get(e2.getKey()).compareTo(expectedSales.get(e1.getKey())))
                .thenComparing(Entry::getKey);

        Long storeId = getStoreIdToChange(demandMap, allocatedAmount, comparator);
        allocatedAmount.put(storeId, allocatedAmount.get(storeId) + 1);
    }
    private static Long getStoreIdToChange(Map<Long, Integer> demandMap, Map<Long, Integer> allocatedAmount, Comparator<Entry<Long, Integer>> comparator ) {
        Map<Long, Integer> differenceBtwAmountAllocatedAndDemand = allocatedAmount.entrySet().stream().filter(e -> e.getValue() != 0)
                .collect(Collectors.toMap(Entry::getKey, entry -> findDifference(entry.getValue(), demandMap.get(entry.getKey()))));
        List<Entry<Long, Integer>> sortedList = new ArrayList<>(differenceBtwAmountAllocatedAndDemand.entrySet());
        sortedList.sort(comparator);
        return sortedList.get(0).getKey();
    }

    private static Integer findDifference(Integer allocatedAmount, Integer demand) {
        return allocatedAmount - demand;
    }

    private static Integer findDemand(BigDecimal expectedSale, BigDecimal stockPreviousDay) {
        return Math.max(expectedSale.subtract(stockPreviousDay).setScale(0, RoundingMode.HALF_UP).intValue(), 0);
    }

    private static <T> T getSumValues(Map<Long, T> map, T identity, BinaryOperator<T> operator) {
        return map.values().stream().reduce(identity, operator);
    }

    private static BigDecimal averageExpectedSales(List<Store> ownExpectedSalesStores) {
        BigDecimal sumExpectedSales = ownExpectedSalesStores.stream().map(Store::getExpectedSales).reduce(BigDecimal.ZERO, BigDecimal::add);
        return sumExpectedSales.divide(bd(ownExpectedSalesStores.size()), 1, RoundingMode.HALF_UP);
    }

    private static <T, U> void printMap(Map<T, U> map, String message) {
        System.out.println(message);
        map.entrySet().forEach(System.out::println);
        System.out.println("\n===============================\n");
    }
}
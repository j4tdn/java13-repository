package allocation;

import model.DataModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreService {

    public static void main(String[] args) {
        // Step 1: Input
        final Integer whAllocationAmount = 300;
        final List<Store> stores = DataModel.getStores();

        // Step 2: Do calculation
        Map<Long, Integer> storeAllocatedAmounts = doAllocation(whAllocationAmount, stores);

        // Step 4: Print out result
        storeAllocatedAmounts.entrySet().stream().forEach(System.out::println);
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

        // Step 2: Calculate Allocation Key

        // Step 3: Calculate Allocated Amount

        // Step 4: Fix rounding issue

        return fixedAllocatedAmountMap;
    }


}

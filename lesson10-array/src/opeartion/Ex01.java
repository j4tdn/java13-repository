package opeartion;

import java.util.Arrays;

/**
 * 1. Calculate sum of odd numbers 2. Find max, min in one loop 3. Add element
 * at index k 4. Remove element from index k 5. Update element at index k 6. Get
 * element at index k
 */
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };

		int sumOfOddElms = sum(numbers, number -> number % 2 != 0);
		System.out.println("sumOfOddElms: " + sumOfOddElms);

		Tuple minMaxTuple = getMaxMin(numbers);
		System.out.println("minMaxTuple: " + minMaxTuple);

		System.out.println("\norigin: " + Arrays.toString(numbers));
		
		System.out.println("\n=====\\\\\\\\=====\n");

		int[] newAddedArray = add(numbers, 3, 18);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));

		int[] newRemoveArray = remove(numbers, 2);
		System.out.println("newRemoveArray: " + Arrays.toString(newRemoveArray));
		
		int[] newDeleteArray = delete(numbers, 4);
		System.out.println("newDeleteArray: " + Arrays.toString(newDeleteArray));

	}
	
	// 4.1 Remove element from index k
	private static int[] delete(int[] origin, int k) {
		// B1: Create a new array with size = preSize - 1
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		
		// B2: Shift left ONE UNIT from k = 3 to length - 1
		for (int i = k; i < result.length -1; i++) {
			result[i] = result[i+1];
		}
		
		// B3: return final array with size from 0 to length - 2
		return Arrays.copyOfRange(result, 0, result.length - 1);
	}

	// 4.2 Remove element from index k
	private static int[] remove(int[] origin, int k) {
		if (k < 0 || k > origin.length - 1) {
			throw new IllegalArgumentException("k is out of range(0, " + (origin.length - 1) + ")");
		}

		// B1: Create a new array with size = preSize - 1
		int[] result = new int[origin.length - 1];

		// B2: Copy origin's elements(from 0 to k-1) to new array
		for (int i = 0; i < k; i++) {
			result[i] = origin[i];
		}

		// B2: Copy origin's elements(from k+1 to length-1) to new array
		for (int i = k; i < result.length; i++) {
			result[i] = origin[i + 1];
		}
		return result;
	}

	// 3. Add element at index k
	private static int[] add(int[] origin, int k, int newNumber) {
		// B1: Create a new array with size = preSize + 1
		int[] result = new int[origin.length + 1];

		// B2: Copy all elements from preArray to newArray
		for (int i = 0; i < origin.length; i++) {
			result[i] = origin[i];
		}

		// B3: Shift right ONE UNIT k = 3 to length - 1
		// SHIRT RIGHT: Iterate form RIGHT to LEFT
		// a[i] = a[i-1]
		for (int i = result.length - 1; i > k; i--) {
			result[i] = result[i - 1];
		}

		// B4: Assign new element into index k=3
		result[k] = newNumber;

		return result;
	}

	// 2. Find maximum, minimum in one loop
	private static Tuple getMaxMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int number : numbers) {
			if (max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
		}
		return new Tuple(max, min);
	}

	// 1. Calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for (int number : numbers) {
			// number % 2 != 0
			if (strategy.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}
}

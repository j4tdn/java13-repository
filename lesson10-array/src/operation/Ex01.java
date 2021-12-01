package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9 ,5, 36, 12, 33};
		// 1. Calculate sum of odd numbers
		int sumOfOddElements = sum(numbers, number-> number % 2 != 0);
		System.out.println("sum of odd numbers: " + sumOfOddElements);

		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");

		// 2. Find maximum, minimum in one loop
		Tuple maxMin = findMaxAndMin(numbers);
		System.out.println("Max and Min: " + maxMin);

		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");

		// 3. Add element at index k
		int[] newAddedArray = add(numbers, 3, 8);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		// 4.Remove element at index k
		int [] newRemoveArr = remove(numbers,2);
		System.out.println("newRemoveArry: "+ Arrays.toString(newRemoveArr));
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		int [] newdeleteArr = delete(numbers,2);
		System.out.println("newRemoveArry: "+ Arrays.toString(newdeleteArr));
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		
	}

	// 1. Calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int result = 0;
		for(int number : numbers) {
			if(strategy.execute(number)) {
				result += number;
			}
		}

		return result;
	}

	// 2. Find maximum, minimum in one loop
	private static Tuple findMaxAndMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int number : numbers) {
			if(max < number) {
				max = number;
			}

			if(min > number) {
				min = number;
			}
		}

		return new Tuple(max, min);
	}

	// 3. Add element at index k
	private static int[] add(int[] numbers, int index, int newElement) {
		// B1. Create a new array with size = preSize + 1
		int[] result = new int[numbers.length + 1];
		// B2. Copy all elements from preArray to newArray
		for(int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		// B3. Shift right ONE UNIT from k to length - 1
		for(int j = result.length - 1; j > index; j--) {
			result[j] = result[j - 1];
		}
		result[index] = newElement;

		return result;
	}
	
	// 4. Remove element at index k
	private static int[] remove(int[] arr, int index ) {
		if(index < 0 || index > arr.length - 1) {
			throw new IllegalArgumentException(index + " cannot out of range (0," + (arr.length-1) + ")");
		}
		int[] result = new int[arr.length - 1];
		for(int i = 0; i < index ; i++) {
			result[i] = arr[i];
		}
		for(int i = index; i< result.length; i++) {
			result[i] = arr[i+1];
		}
		
		return result;
	}
	
	// 4.1 Remove element at index k Opt2
	private static int[] delete(int[] arr, int index ) {
		if(index < 0 || index > arr.length - 1) {
			throw new IllegalArgumentException(index + " cannot out of range (0," + (arr.length-1) + ")");
		}
		int[] result = Arrays.copyOf(arr, arr.length);
		for(int i = index; i< result.length - 1; i++) {
			result[i] = result[i+1];
		}
		
		return Arrays.copyOf(result, arr.length-1);
	}
	
}

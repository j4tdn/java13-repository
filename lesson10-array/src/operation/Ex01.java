package operation;

import java.util.Arrays;

public class Ex01 {
	
	public static void main(String[] args) {
		int[] numbers = {1, 9 ,5, 36, 12, 33};
		// 1. Calculate sum of odd numbers
		int sumOfOddElements = sum(numbers, number-> number % 2 != 0);
		System.out.println("som of odd numbers: " + sumOfOddElements);
		
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		
		// 2. Find maximum, minimum in one loop
		Tuple maxMin = findMaxAndMin(numbers);
		System.out.println("Max and Min: " + maxMin);
		
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		
		// 3. Add element at index k
		int[] newAddedArray = add(numbers, 3, 8);
		System.out.println("newAddedArray: " + Arrays.toString(newAddedArray));
		
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		
		int[] newRemovedArray = remove(numbers, 1);
		System.out.println("newRemovedArray: " + Arrays.toString(newRemovedArray));
		
		System.out.println("\n==========\\\\\\\\\\\\\\==========\n");
		
		int[] newDeletedArray = delete(numbers, 4);
		System.out.println("newDeletedArray: " + Arrays.toString(newDeletedArray));
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
	private static int[] add(int[] origin, int index, int newElement) {
		// B1. Create a new array with size = preSize + 1
		int[] result = new int[origin.length + 1];
		// B2. Copy all elements from preArray to newArray
		for(int i = 0; i < origin.length; i++) {
			result[i] = origin[i];
		}
		// B3. Shift right ONE UNIT from k to length - 1
		for(int j = result.length - 1; j > index; j--) {
			result[j] = result[j - 1];
		}
		result[index] = newElement;
		
		return result;
	}
	
	// 4. Remove element at index k
	private static int[] remove(int[] origin, int k) {
		if(k < 0 || k >= origin.length) {
			throw new IllegalArgumentException(k + " is out of range(0," + (origin.length - 1) + ")"); 
		}
		
		int[] result = new int[origin.length - 1];
		int index = 0;
		
		for(int i = 0; i < origin.length; i++) {
			if(i == k) {
				continue;
			}
			result[index++] = origin[i];
		}
		
		return result;
	}
	
	// 4.1 Remove element at index k
	private static int[] delete(int[] origin, int k) {
		// B1. Create a new array with size = preSize & copy all elements to new array
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		
		// B2. Shift Left ONE UNIT from k to < length - 1
		for(int i = k; i < result.length - 1; i++) {
			result[i] = result[i + 1];
		}
		
		// B3. Return final array with size from 0 to length - 2
		return Arrays.copyOfRange(result, 0, result.length - 1);
	}
}

package operation;
/*
 *1. Calculate sum of odd numbers
 *2. Find maximum, minimum in one loop
 *3. Add element at index k
 *4. Remove element from index k 
 *5. Update element at index k
 *6. Get element at index k
 */

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		int sumOfOddNumber = sum(numbers, a -> a % 2 != 0);
		System.out.println("1. Sum of odd numbers: " + sumOfOddNumber);
		
		Tuple maxmin = getMaxMin(numbers);
		System.out.println("2. Find maximum, minimum in one loop: " + maxmin.toString());
		
		int[] result = addNumbers(numbers, 3, 18);
		System.out.println("3. Add number into arrays: " + Arrays.toString(result));
		
		int[] remove = removeNumber(numbers, 3);
		System.out.println("4. Remove number in array: " + Arrays.toString(remove));
	}
	//4. Remove element at index k
	private static int[] removeNumber(int[] numbers, int k) {
		int[] result = new int[numbers.length - 1];
		for(int i = 0; i < k; i++) {
			result[i] = numbers[i];
		}
		for(int i = k; i < result.length; i++) {
			result[i] =numbers[i+1];
		}
		return result ;
	}
	
	//3. Add element at index k
	private static int[] addNumbers(int[] numbers, int k, int newNumber) {
		int[] result = new int[numbers.length + 1];
		
		for(int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		for(int i = result.length - 1; i > k; i--) {
			result[i] = result[i-1];
			
		}
		result[k] = newNumber;
		return result;
	}
	
	//2. Find maximum in oneloop
	private static Tuple getMaxMin(int[] numbers) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int number: numbers) {
			if(number > max) max = number;
			if(number < min) min = number;
		}
		
		return new Tuple(max, min);
	}
	
	//1. Calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for(int number: numbers) {
			if(strategy.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}
}

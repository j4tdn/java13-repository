package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		
		
		System.out.println("Sum of Odd number: " + sum(numbers, number -> number % 2 != 0));
		System.out.println(getMaxAndMin(numbers).toString());
		System.out.println("newArrays: " + Arrays.toString(add(numbers, 19, 3)));
		try {
			System.out.println("newArraysAfterRemove:" + Arrays.toString(remove(numbers, 3)));
		} catch (IllegalAccessException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	private static int[] remove(int[] origin, int k) throws IllegalAccessException {
		if(k<0||k>origin.length) {
			throw new IllegalAccessException(k + " is out of range (0," + (origin.length) + ")");
		}
		int[] copy = origin;
		for(int i = k ; i < copy.length - 1 ; i++) {
			copy[i] = copy[i+1];
		}
		return Arrays.copyOfRange(copy, 0, copy.length-1);
	}
	// 1. Calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for(int number: numbers) {
			if(strategy.execute(number)) {
				sum+=number;
			}
		}
		return sum;
	}
	// 2. Find maximum, minimum in one loop
	private static Tuple getMaxAndMin(int[] numbers) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int number: numbers) {
			if(max < number) {
				max = number;
			}
			if(min > number) {
				min = number;
			}
		}
		
		return new Tuple(max, min);
	}
	// 3. Add an element at index k
	
	private static int[] add(int[] numbers, int value, int index) {
		int[] a = new int[numbers.length+1];
		
		for(int i = 0; i < numbers.length; i++) {
			a[i] = numbers[i];
		}
		for(int i = a.length -1 ; i >= index; i--) {
			a[i] = a[i-1];
			if(i == index) {
				a[i] = value;
			}
		}
		
		return a;
	}
}

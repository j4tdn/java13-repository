package sorting;

import java.util.Arrays;

import utils.Swap;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers, (int a, int b) -> a - b);
		System.out.println("Bubble Sort - ASC: " + Arrays.toString(numbers));
		
		System.out.println("=================================================");
		
		sort(numbers, (int a, int b) -> b - a);
		System.out.println("Bubble Sort - DESC: " + Arrays.toString(numbers));
		
		
	}

	private static void sort(int[] numbers, Condition c) {
		for (int round = 0; round < numbers.length; round++) {
			for (int i = 0; i < numbers.length - round - 1; i++) {
				if (c.check(numbers[i], numbers[i + 1]) > 0) {
					Swap.swap(numbers, i, i + 1);
				}
			}
		}
	}

}

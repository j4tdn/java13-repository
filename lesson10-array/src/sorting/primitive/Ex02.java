package sorting.primitive;

import java.util.Arrays;

import utils.Utils;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		sort(numbers);
		System.out.println("Selection Sort - ASC: " + Arrays.toString(numbers));
		
		System.out.println("=================================================");
	}
 
	private static void sort(int[] numbers) {
		for (int round = numbers.length - 1; round > 0; round--) {
			for (int j = 0; j < round; j++) {
				if (numbers[j] < numbers[round]) {
					Utils.swap(numbers, j, round);
				}
			}
		}
	}
}

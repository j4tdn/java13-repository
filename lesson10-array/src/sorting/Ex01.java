package sorting;

import java.util.Arrays;

/**
 * 
 * 1. Bubble sort with integer primitive array >> ASC: ASCENDING >> DESC:
 * DESCENDING
 */

public class Ex01 {

	public static void main(String[] args) {
		int[] origin = { 1, 5, 11, 11, 9, 4, 6 };

		sort(origin, (a , b) -> b - a);

		System.out.println("Ascending: " + Arrays.toString(origin));
	}

	private static void sort(int[] origin, Strategy strategy) {
		for (int i = 0; i < origin.length; i++) {
			for (int j = 0; j < origin.length - i - 1; j++) {
				// Positive if a > b
				// Negative if a < b
				// Zero 	if a == b
				if (strategy.compare(origin[j], origin[j + 1]) > 0) {
					swap(origin, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}
}

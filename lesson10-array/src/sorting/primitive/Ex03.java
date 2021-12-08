package sorting.primitive;

import java.util.Arrays;

import utils.Utils;
/**
 * Insertion sort 
 *
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] origin = { 4, 3, 2, 10, 12, 1, 5, 6 };
		sort(origin);
		System.out.println("Insertion sort: " + Arrays.toString(origin));
	}

	private static void sort(int[] origin) {
		// ascending <
		// descending >
		for (int i = 1; i < origin.length; i++) {
			for (int j = 0; j < i; j++) {
				if (origin[i] < origin[j]) {
					Utils.swap(origin, i, j);
				}
			}
		}
	}

}

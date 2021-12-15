package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Insertion Sort
 */
public class Ex03 {
	public static void main(String[] args) {
		int[] origin = { 4, 3, 2, 10, 12, 1, 10, 5, 6 };
		sort(origin);
		System.out.println("Insertion Sort: " + Arrays.toString(origin));
	}

	private static void sort(int[] origin) {
		for (int i = 1; i < origin.length; i++) {
			int key = origin[i]; // pivot value
			for (int j = 0; j < i; j++) {
				// ascending <
				// descending >
				if (key > origin[j]) {
					ArrayUtils.swap(origin, i, j);
				}
			}
		}
	}

}

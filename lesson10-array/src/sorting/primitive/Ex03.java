package sorting.primitive;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 
 * Insertion sort
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 10, 12, 1, 5, 6 };
		sort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					ArrayUtils.swap(arr, i, j);
				}
			}
		}
	}
}

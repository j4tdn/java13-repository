package sorting.object;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array
 * DESC || ASC
 *
 * >> Using sorting manually
 */
public class Ex01 {
	
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Lionel Messi",
				"Cristiano Ronaldo"
		};
		
		// Required: Ascending
		insertionSort(students);
		System.out.println(Arrays.toString(students));
	}

	private static void insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			for (int j = 0; j < i; j++) {
				// ASC: key < sequences[j]
				if (key.compareTo(arr[j]) < 0) {
					ArrayUtils.swap(arr, i, j);
				}
			}
		}
	}
}

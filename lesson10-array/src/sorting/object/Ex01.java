package sorting.object;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * DESC || ASC
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexandree"
		};
		insertionSort(students);
		ArrayUtils.print("Array Sorting: ", students);
	}
	
	private static void insertionSort(String[] sequences) {
		for(int i = 1; i < sequences.length; i++) {
			String key = sequences[i];
			for(int j = 0; j < i; j++) {
				// Ascending
				// Descending
				if(key.compareTo(sequences[j]) < 0) {
					ArrayUtils.Swap(sequences, i, j);
				}
			}
		}
	}
}

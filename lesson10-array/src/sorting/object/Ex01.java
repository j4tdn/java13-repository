package sorting.object;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * DESC || ASC
 * 
 * >> Using insertion sort manually
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] students = {
			"John Smith",
			"Susan Dann",
			"Rivalho",
			"Alexander Pato"
		};
		
		// Required: Ascending
		insertionSort(students);
		ArrayUtils.print("Array Sorting", students);
	}
	
	private static void insertionSort(String[] sequences) {
		for (int i = 1; i < sequences.length; i++) {
			String key = sequences[i]; // pivot value
			for (int j = 0; j < i; j++) {
				// ASC: key < sequences[j]
				if (key.compareTo(sequences[j]) < 0) {
					ArrayUtils.swap(sequences, i, j);
				}
			}
		}
	}
}

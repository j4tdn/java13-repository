package sorting.object;

import utils.ArrayUtils;

/**
 * 
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

	private static void insertionSort(String[] sequence) {
		for (int i = 1; i < sequence.length; i++) {
			String key = sequence[i]; // pivot value
			for (int j = 0; j < i; j++) {
				// key < sequences[j]
				if (key.compareTo(sequence[j]) > 0) {
					ArrayUtils.swap(sequence, i, j);
				}
			}
		}
	}
}

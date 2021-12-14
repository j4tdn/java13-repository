package sorting.object;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array
 * DESC || ASC
 * 
 * >> Using Java sorting method
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] students = { 
				"John Smith", 
				"Susan Dann", 
				"Rivalho", 
				"Alexander Pato" 
		};

		// Required: Each element implements Comparable Interface
		// Override method "compareTo" to define ASC
		
		// String implement Comparable
		// Override method "comapreTo"
		
		// Default: ASC
		Arrays.sort(students);
		
		//Required: Sorting DESC without using reverse method >> Ex03
		
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

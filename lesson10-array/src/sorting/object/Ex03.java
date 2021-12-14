package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array
 * DESC || ASC
 * 
 * >> Using Java sorting method
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = { 
				"John Smith", 
				"Susan Dann", 
				"Rivalho", 
				"Alexander Pato" 
		};

		// Anonymous class
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// s1: previous element
				// s2: next element
				// previous > next ==> positive(swap) ==> ASC
				// previous < next ==> positive(swap) ==> DSC
				return s1.compareTo(s2);
			}
		};
		
		// Loop elements
		// 	Loop elements ...
		// 		if (comparator.compare(a[i], a[j]) > 0 {
		//				a[i]: previous element
		//				a[j]: next element
		//				swap(a[i], a[j]);
		//		}
		Arrays.sort(students, comparator);
		
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

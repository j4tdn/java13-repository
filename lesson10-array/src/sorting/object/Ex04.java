package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array DESC || ASC
 * 
 * >> Using Java sorting method
 * >> Handle null, value
 */
public class Ex04 {
	public static void main(String[] args) {
		String[] students = {null, "John Smith", "Susan Dann", null, "Rivalho", "Alexander Pato" };
		// Sorting with null values
		// NULL FIRST, ASC || DESC >> NULL NULL a b c || NULL NULL c b a
		// ASC DESC NULL || ASC >> a b c NULL NULL || c b a NULL NULL
		
		// Required: NULL FIRST & DESCENDING
		// Required: NULL LAST & ASCENDING
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// s1: previous element
				// s2: next element
				// previous > next ==> positive(swap) ==> ASC
				// previous < next ==> positive(swap) ==> DSC
				
				if (s1 == null && s2 != null) {
					return 1;
				}
				
				// s1 != null
				
				if (s2 == null) {
					return -1;
				}
				
				// s1 & s2 != null
				// return s2.compareTo(s1)
				return s1.compareTo(s2);
			}
		};

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

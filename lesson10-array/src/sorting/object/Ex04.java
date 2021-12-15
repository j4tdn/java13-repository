package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array DESC || ASC
 * 
 * >> Using Java sorting method
 * >> Handle null value
 */
public class Ex04 {
	public static void main(String[] args) {
		String[] students = { null, "John Smith", "Susan Dann", null, "Rivalho", "Alexander Pato" };
		// Sorting with null values
		// NULL FIRST, ASC || DESC >>> NULL NULL a b c || NULL NULL c b a
		// ASC, DESC  NULL LAST    >>  a b c NULL NULL || c b a NULL NULL
		
		// Required: NULL FIRST & DESCENING
		// Required: NULL LAST & ASCENDING
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// s1: previous element
				// s2: next element
				// pre > next ==> positive(swap) ==> ASC
				// pre < next ==> positive(swap) ==> DESC
				
				if (s1 == null && s2 != null) {
					// return -1;
					return 1;
				}
				
				// s1 != null
				
				if (s2 == null) {
					// return 1;
					return -1;
				}
				
				// s1 & s2 != null
				// return s2.compareTo(s1);
				return s1.compareTo(s2);
			}
		};
		
		// Loop elements
		//   Loop elements ... 
		//     if (comparator.compare(a[i], a[j]) > 0) {
		//          a[i]: previous element 
		//          a[j]: next element
		//          swap(a[i], a[j])
	    //     }
		Arrays.sort(students, comparator);

		ArrayUtils.print("Array Sorting", students);
	}

}

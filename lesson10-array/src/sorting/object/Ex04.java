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
public class Ex04 {
	
	public static void main(String[] args) {
		String[] students = {
				null,
				"John Smith",
				"Susan Dann",
				null,
				"Lionel Messi",
				"Cristiano Ronaldo"
		};
		// Sorting with null values
		// NULL FIRST, ASC || DESC
		// ASC || DESC NULL LAST
		
		
		// Required: NULL FIRST & DESCENDING
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// o1: previous element
				// o2: next element
				// previous > next ==> positive(swap) ==> ASC
				// previous < next ==> positive(swap) ==> DESC
				
				if(s1 == null && s2 != null) {
				// return -1; NULL FIRST
					return 1;
				}
				
				// s1 != null
				
				if(s2 == null) return -1;
				
				
				return s2.compareTo(s1);
				
			}
		};
		
		Arrays.sort(students, comparator);
		System.out.println(Arrays.toString(students));
	}

	
}

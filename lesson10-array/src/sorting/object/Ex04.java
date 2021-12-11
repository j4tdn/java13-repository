package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;
/**
 * Handle null value
 */
public class Ex04 {
	public static void main(String[] args) {
		String[] students = {
				null,
				"John Smith",
				null,
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		// Sorting with null values
		// NULL FIRST, ASC||DESC
		// NULL LAST
		
		// Required: NULL FIRST & DESCENDING
		// Required: NULL LAST & ASCENDING
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1==null) // return -1;
					return 1;
				if(s2==null) // return 1;
					return -1;
				return s1.compareTo(s2); //s2.compareTo(s1);
						
			}
		};
		Arrays.sort(students, comparator);
		// Required: sorting DESC without using reverse method >> Ex03
		ArrayUtils.print("Array Sorting", students);
	}
	
}

package sorting.object;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * 
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexandree"
		};
		// Required: Each element implements Comparable Interface
		// Override method "compareTo" to define ASC
		
		// String implement Comparable
		// Override method "compareTo"
		Arrays.sort(students);
		
		// Required: Sorting DESC without using reverse method >> EX03 
		
		ArrayUtils.print("Array Sorting: ", students);
	}

}

package sorting.object;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array DESC || ASC
 * 
 * >> Using Java sorting method
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };

		// Required: Each element implements Comparable Interface
		// Override method "compareTo" to define ASC || DESC
		
		// String implement Comparable
		// Override method "compareTo"
		
		// Default: ASC
		Arrays.sort(students);
		
		// Required: Sorting DESC without using reverse method >> Ex03

		ArrayUtils.print("Array Sorting", students);
	}

}

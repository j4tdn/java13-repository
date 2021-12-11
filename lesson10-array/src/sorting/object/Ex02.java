package sorting.object;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		// Required : Each element implements Comparable Interface
		// Override method "compareTo" to define ASC||DESC
		// String implement Comparable
		// Default: ASC
		Arrays.sort(students);
		ArrayUtils.print("Array Sorting", students);
	}
	
}

package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 */
import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Adam Dan",
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
		//Default: ASC
		Arrays.sort(students);
		//Required: Sorting DESC 
		ArrayUtils.print("Student Sorting: ", students);
	}
	
	
}

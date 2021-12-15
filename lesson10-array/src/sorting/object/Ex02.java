package sorting.object;

import java.util.Arrays;

import Utils.ArrayUtils;

/**
 * Sorting with String [] Array
 * DESC || ASC
 * Using Java sorting method
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		String [] students = {
				"John Smith",
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		//Required : Each element implements comparable Interface
		//Override method " compareTo " to define ASC || DESC
		
		Arrays.sort(students);
		ArrayUtils.show("Array Sorting", students);
	}
	
}

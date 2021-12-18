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
		Arrays.sort(students);
		
		ArrayUtils.print("Array Sorting", students);
	}
	
}


package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 */
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Adam Dan",
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return (-1) * s1.compareTo(s2);
			}
			
		};
		//Required: Sorting DESC 
		Arrays.sort(students, comparator);
		ArrayUtils.print("Student Sorting: ", students);
	}
	
	
}

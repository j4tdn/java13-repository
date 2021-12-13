package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 * >> handle null value
 */
import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex04 {
	public static void main(String[] args) {
		String[] students = {
				null,
				"John Smith",
				"Adam Dan",
				null,
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
		
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				if(s1 == null) return -1;
				if(s2 == null) return 1;
				
				return s1.compareTo(s2);
			}
			
		};
		//Required: Sorting DESC 
		Arrays.sort(students, comparator);
		ArrayUtils.print("Student Sorting: ", students);
		
		
	}
	
	
}

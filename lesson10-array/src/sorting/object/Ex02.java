package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * 
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				null,
				"Rivalho",
				"Alexandree"
		};
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				
				return (-1)*o1.compareTo(o2);
			}
		};
		
		Arrays.sort(students, comparator);
		
		ArrayUtils.print("Array Sorting: ", students);
	}

}

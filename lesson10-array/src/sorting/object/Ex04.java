package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import Utils.ArrayUtils;

/**
 * Sorting with String [] Array
 * DESC || ASC
 * Using Java sorting method
 * Handel null value
 */
public class Ex04 {
	public static void main(String[] args) {
		String [] students = {null,
				"John Smith",
				"Susan Dann",
				null,
				"Rivalho",
				"Alexander Pato"
				
			//Sorting with null values
			//NULL FIRST, ASC || DESC
			//ASC ,DESC NULL LAST
			
			
		};
		//Required : NULL FIRST & DESCENDING
		// anonymous class
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//s1 : previous element
				//s2: next element
				//pre > next ==> positive (swap) ==> ASC
				//pre < next ==> positive (swap) ==> DESC
				if (s1 == null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}
				return  s1.compareTo(s2);
			}
		};
		
		Arrays.sort(students, comparator);
		ArrayUtils.show("Array Sorting", students);
	}
	
}

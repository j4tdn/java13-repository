package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utlis.ArrayUtils;

/*
 * Sorting with String[ Array
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = {
				null,
				"John Smith",
				null,
				"Susan Dann",
				"Rivalho",
				"Alexander Pato"
		};
		// Required: NULL FIRST & DESCENDING
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// s1: previous element
				// s2:next element
				// pre > next ==> positive(swap) ==> ASC
				// pre < next ==> positive(swap) ==>DESC
				
				if(s1==null) {
					return -1;
				}
				// s1 != null
				if(s2 == null) {
					return 1;
				}
				// s1 & s2 !=null
				return (-1)*s1.compareTo(s2);	
			}
		};
		
		Arrays.sort(students, comparator);;
		ArrayUtils.print("sort",students);
	}
	

}

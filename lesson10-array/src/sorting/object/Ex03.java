package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] students = {
			"John Smith",
			null,
			"Susan Dann",
			"Rivalho",
			null,
			"Alexander Pato"
		};
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
//				if (s1.compareTo(s2) > 0) return -1;
//				if (s1.compareTo(s2) == 0) return 0;
//				return 1;
				
				if (s1 == null && s2 != null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}
				
				return s1.compareTo(s2);
			}
		};
		Arrays.sort(students, comparator);
		
		ArrayUtils.print("Array Sorting", students);
	}
	
}


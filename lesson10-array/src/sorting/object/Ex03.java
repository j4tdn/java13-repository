package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array DESC || ASC
 * 
 * >> Using Java sorting method
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };
		
		// anonymous class
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// s1: previous element
				// s2: next element
				// pre > next ==> positive(swap) ==> ASC
				// pre < next ==> positive(swap) ==> DESC
				
				/*if (s1.compareTo(s2) > 0) return 1;
				if (s1.compareTo(s2) == 0) return 0;
				return -1*/;
				return s1.compareTo(s2);
			}
		};
		
		// Compile Time >> Need pass instance of Comparator interface
		// Loop elements
		//   Loop elements ... 
		//     if (comparator.compare(a[i], a[j]) > 0) {
		//          a[i]: previous element 
		//          a[j]: next element
		//          swap(a[i], a[j])
	    //     }
		Arrays.sort(students, comparator);

		ArrayUtils.print("Array Sorting", students);
	}

}

package sorting.object;

import static utils.Utils.*;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };

		// Required: Each element implements Comparable Interface
		
//		Arrays.sort(students, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		Arrays.sort(students, (m1, m2) -> m2.compareTo(m1));
		
		print("Array Sorting: ", students);
	}

}

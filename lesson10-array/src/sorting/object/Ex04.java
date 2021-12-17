package sorting.object;

import static utils.Utils.*;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex04 {
	public static void main(String[] args) {
		String[] students = { null, "John Smith", "Susan Dann", null, null, "Rivalho", "Alexander Pato" };
		// Sorting with null values
		// NULL FIRST, ASC || DESC
		// ASC, DESC, NULL LAST
		// Required: Each element implements Comparable Interface

		// Required :: NULL FIRST & DESCENDING
		// Required :: NULL LAST & ASCENDING
		Arrays.sort(students, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 == null && o2 != null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});

		// Arrays.sort(students, (m1, m2) -> m1 == null ? 1 : ((m2 == null) ? -1 : m1.compareTo(m2)));
		
		print("Array Sorting: ", students);
	}

}

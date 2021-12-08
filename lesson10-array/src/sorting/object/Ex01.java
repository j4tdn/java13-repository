package sorting.object;

import static utils.Utils.*;

import java.util.Arrays;

/**
 * Sorting with String[] Array
 * >> Using Insertion Sort manually
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };
		// Required: Ascending
		insertionSort(students);
		print("Array Sorting: ", students);
	}

	private static void insertionSort(String[] students) {
		// ascending <
		// descending >
		for (int i = 1; i < students.length; i++) {
			for (int j = 0; j < i; j++) {
				if (students[i].compareTo(students[j]) < 0) {
					swap(students, i, j);
				}
			}
		}
	}

}

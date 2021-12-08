package sorting.object;

import static utils.Utils.*;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };
		
		// Required: Each element implements Comparable Interface
		
		Arrays.sort(students);
				
		print("Array Sorting: ", students);
	}

}

package sorting.object;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

import java.util.Arrays;

import utils.Utils;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex07 {
	public static void main(String[] args) {
		String[] students = { null, "John Smith", "Susan Dann", null, null, "Rivalho", "Alexander Pato" };
		// handle null value
		
		
		//nullsFirst
		//nullsLast
		Arrays.sort(students, nullsFirst(comparing(identity(), reverseOrder())));
		
		Utils.print("Array Sorting", students);
		
	}

}

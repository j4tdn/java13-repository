package sorting.object;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * 
 */
public class Ex07 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", null, "Rivalho", null, "Alexandree"};
		
		Arrays.sort(students, nullsFirst(comparing(identity(), reverseOrder())));
		ArrayUtils.print("Array Sorting: ", students);
	}

}
package sorting.object;
/*
 * Sorting with String[] Array
 * DESC || ASC
 * >> using sort method of Java
 * >> handle null value
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;
import static java.util.function.Function.*;
import static java.util.Comparator.*;
public class Ex07 {
	public static void main(String[] args) {
		String[] students = {
				null,
				"John Smith",
				"Adam Dan",
				null,
				"Lionel Messi",
				"Cristiano Ronaldo",
		};
	
		Arrays.sort(students, nullsLast(comparing(identity(), reverseOrder())));
		ArrayUtils.print("Student Sorting: ", students);
		
		
	}
	
	
}

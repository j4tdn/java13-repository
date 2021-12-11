package sorting.object;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static java.util.function.Function.identity;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * 
 */
public class Ex06 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", null, "Rivalho", "Alexandree"};
		
		// anonymous class
//		Function<String, String> keyExtractor = new Function<String, String>() {
//			@Override
//			public String apply(String string) {
//				return string;
//			}
//		};
		
		// anonymous function <=> lambda
		// Function<String, String> keyExtractor = s -> s;
		// Function<String, String> keyExtractor = Function.identity();
		
//		Comparator<String> comparator = comparing(identity(), reverseOrder());
//		Arrays.sort(students, comparator);
		
		
		Arrays.sort(students, comparing(identity(), reverseOrder()));
		ArrayUtils.print("Array Sorting: ", students);
	}

}

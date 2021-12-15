package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.function.Function.*;
import static java.util.Comparator.*;

import utils.ArrayUtils;

public class Ex06 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };

		// anonymous class
//		Function<String, String> keyExtractor = new Function<String, String>() {
//			public String apply(String string) {
//				return string;
//			};
//		};
		
		// anonymous function <=> lambda
		// Function<String, String> keyExtractor = s -> s;
		// Function<String, String> keyExtractor = Function.identity();
		
		// Comparator<String> comparator = comparing(identity(), reverseOrder());
		// Arrays.sort(students, comparator);
		
		Arrays.sort(students, comparing(identity(), reverseOrder()));

		ArrayUtils.print("Array Sorting", students);
	}

}

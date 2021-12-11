package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.function.Function;

import utils.ArrayUtils;

/**
 * Sorting with String[] Array
 * 
 */
public class Ex05 {
	public static void main(String[] args) {
		String[] students = {
				"John Smith",
				"Susan Dann",
				null,
				"Rivalho",
				"Alexandree"
		};
		//Comparator<String> comparator = (o1,o2) -> o1.compareTo(o2);
		
		// Replace comparator above
		Function<String, String> keyExtractor = new Function<String, String>() {
			// input: element in array
			// output: element's value type want to compare
			@Override
			public String apply(String string) {
				return string;
			}
		};
		
		Comparator<String> comparator = comparing(keyExtractor, reverseOrder());
		
		
		Arrays.sort(students, comparator);
		
		ArrayUtils.print("Array Sorting: ", students);
	}

}

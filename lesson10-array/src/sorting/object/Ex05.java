package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.*;

import utils.ArrayUtils;

public class Ex05 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };
		// Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

		// Replace comparator above
		Function<String, String> keyExtractor = new Function<String, String>() {
			// input: element in array
			// output: element's value type want to compare
			public String apply(String string) {
				return string;
			};
		};

		Comparator<String> comparator = comparing(keyExtractor, reverseOrder());

		Arrays.sort(students, comparator);

		ArrayUtils.print("Array Sorting", students);
	}

}

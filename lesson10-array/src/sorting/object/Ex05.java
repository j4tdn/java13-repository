package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.function.Function;

import utils.Utils;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex05 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };

		//Comparator<String> comparator = (o1, o2)  -> o1.compareTo(o2);

		Function<String, String> keyFunction = new Function<String, String>() {
			//input: element in array
			//output: element's value type want to compare
			@Override
			public String apply(String str) {
				return str;
			}
			
		};
		//Replace comparator above
		Comparator<String> comparator = comparing(keyFunction, reverseOrder());
		Arrays.sort(students, comparator);
		Utils.print("Array Sorting", students);
		
	}

}

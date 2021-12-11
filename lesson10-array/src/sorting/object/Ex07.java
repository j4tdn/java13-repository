package sorting.object;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import utils.ArrayUtils;

/**
 * 
 * Sorting with String[] Array DESC || ASC
 *
 * >> Using Java sorting method
 */
public class Ex07 {

	public static void main(String[] args) {
		String[] students = {null, "John Smith", "Susan Dann", null, "Lionel Messi", "Cristiano Ronaldo" };
		
		// Anonymous class
//		Function<String, String> keyExtractor = new Function<String, String>() {
//			@Override
//			public String apply(String t) {
//				return t;
//			}
//		};

		// Anonymous function <=> Lambda
//		Function<String, String> keyExtractor = string -> string;
		
//		Comparator<String> comparator = Comparator.comparing(keyExtractor);

		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
	}

}

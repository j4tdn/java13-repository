package sorting.object;

import static java.util.Comparator.*;
import static java.util.function.Function.*;

import java.util.Arrays;

import utils.Utils;

/**
 * Sorting with String[] Array >> Using Java Sorting method
 */
public class Ex06 {
	public static void main(String[] args) {
		String[] students = { "John Smith", "Susan Dann", "Rivalho", "Alexander Pato" };

		
		//anonymous class
//		Function<String, String> keyExFunction = new Function<String, String>() {
//			
//			@Override
//			public String apply(String t) {
//				return t;
//			}
//		};
		
		
		//anonymous function <=> lamda
		//Function<String, String> keyFunction = str -> str;
		//Function<String, String> keyFunction = Function.identity();
		
		//Replace comparator above
//		Comparator<String> comparator = comparing(identity(), reverseOrder());
//		Arrays.sort(students, comparator);
		
		Arrays.sort(students, comparing(identity(), reverseOrder()));
		
		
		Utils.print("Array Sorting", students);
		
	}

}

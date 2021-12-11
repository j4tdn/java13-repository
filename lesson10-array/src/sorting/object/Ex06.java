package sorting.object;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import static java.util.function.Function.*;

import utils.ArrayUtils;

public class Ex06 {
	public static void main(String[] args) {
		String[] students = {"John Smith", "Susan Dann", "Rivalho", "Alexander Pato"};
		// Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);		
		
		// anonymous class
//		Function<String, String> keyExtractor = new Function<String, String>() {
//
//			@Override
//			public String apply(String string) {
//				
//				return string;
//			}
//			
//		};
		// lambda
		// Function<String, String> keyExtractor = string -> string;
		// Function<String, String> keyExtractor = Function.identity();
		
		// Comparator<String> comparator = comparing(identity(), reverseOrder());
		
		Arrays.sort(students, comparing(identity(), reverseOrder()));
		
		ArrayUtils.print("Array Sorting", students);
	}
	
}

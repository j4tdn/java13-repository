package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Functional Interface available in Java
 * + Predicate
 */
public class JavaPredicateDemo {
	public static void main(String[] args) {
		// predicate to check String length is greater than 8 or not
		// C1: selection
		System.out.println("isValid 1: " + ("hello12345".length() > 8));
		
		// C2
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String string) {
				return string.length() > 2;
			}
		};
		
		boolean isValid = predicate.test("hello12345");
		System.out.println("isValid 2: " + isValid);
		
		System.out.println("=====================");
		
		// C2: prefer way
		List<String> result = filter(Arrays.asList("aa", "bbbb", "ccc", "d"), text -> text.length() > 2);
		for (String element: result) {
			System.out.println(element);
		}
	}
	
	// Third-party method
	private static List<String> filter(List<String> elements, Predicate<String> predicate) {
		List<String> result = new ArrayList<>();
		for (String element: elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}

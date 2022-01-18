package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import utils.Printable;

/**
 * Java Available Functional Interface +) Predicate
 *
 */
public class JavaPredicateDemo {
	public static void main(String[] args) {
		// predicate to check string length is greater than 8 or not

		// C1: selection
		System.out.println("isValid: " + ("hello".length() > 8));

		// C2: predicate
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String str) {
				return str.length() > 8;
			}
		};

		boolean isValid = predicate.test("hello");
		System.out.println("isValid: " + isValid);

		// When do we use C1 and C2?
		// C1: if we just want to consider one string
		// C2: if we want to consider a list of strings, use predicate as a paramenter
		// of function
		List<String> demo = Arrays.asList("hello", "trancongviet", "helloworld", "viet");
		List<String> result = filter(demo, str -> str.length() > 8);
		Printable.printALL(result);
	}

	private static List<String> filter(List<String> elements, Predicate<String> predicate) {
		List<String> result = new ArrayList<>();
		for (String element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}

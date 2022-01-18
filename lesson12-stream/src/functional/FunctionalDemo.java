package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Functional Interface available in Java
 * + Predicate
 */
public class FunctionalDemo {
	public static void main(String[] args) {
		// Predicate to check String length is greater than 8 or not
		// C1: selection
		System.out.println("isValid1 :" + ("Hello12345".length() > 8));
		
		// C2
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 2;
			}
		};
		
		boolean isValid = predicate.test("Hello");
		System.out.println("isValid2: " + isValid);
		
		System.out.println("========================");
		
		// C2: Prefer way
		List<String> result = filter(Arrays.asList("aa", "bbbbb", "ccc", "d"), s -> s.length() > 2);
		result.forEach(s -> System.out.println(s));
	}
	
	// Third-party method
	private static List<String> filter(List<String> elements, Predicate<String> predicate) {
		List<String> result = new ArrayList<>();
		for(String element : elements) {
			if(predicate.test(element)) {
				result.add(element);
			}
		}
		
		return result;
	}
}

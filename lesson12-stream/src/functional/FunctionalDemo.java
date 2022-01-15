package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalDemo {
	public static void main(String[] args) {
		// Predicate
		System.out.println("isValid 1: " + ("hello12345".length() > 8));
		
		// C2
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length() > 2;
			}
		};
		
		boolean isValid = predicate.test("hello12345");
		System.out.println("isValid 2: " + isValid)	;
		
	}
	
	@SuppressWarnings("unused")
	private static List<String> filter (List<String> elements, Predicate<String> predicate) {
		List<String> result = new ArrayList<String>();
		
		for (String element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}	
}

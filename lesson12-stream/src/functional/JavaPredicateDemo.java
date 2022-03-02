package functional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
/**
 * Functional Interface available in JAVA
 * + Predicate
 */
public class JavaPredicateDemo {
	public static void main(String[] args) {
		// c1: selection
		System.out.println("isValid 1: " + ("hello12345".length()>8));
		// C2
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String string) {
				return string.length()>8;
			}
		};
		boolean isValid = predicate.test("hello12345");
		System.out.println("isValid 2: " + isValid);
		System.out.println("=======================");
		
	}
	
}

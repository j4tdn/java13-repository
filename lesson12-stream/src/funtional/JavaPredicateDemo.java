package funtional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Functional Interface available in Java
 * + Predicate
 */

public class JavaPredicateDemo {
	public static void main(String[] args) {
		//predicate to check String length is greater than 8 or not
		
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 8;
			}
		};
		
		boolean isValid = predicate.test("hello123123");
		System.out.println("is Valid:" + isValid);
		
		
		//C2: prefer way
		List<String> result = filter(Arrays.asList("aa","bbbb", "ccc","dd"), text -> text.length() > 2);
		for(String element: result) {
			System.out.println(element);
		}
	}
	
	private static List<String> filter(List<String> elements, Predicate<String> predicate){
		List<String> result = new ArrayList<>();
		for(String element: elements) {
			if(predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}

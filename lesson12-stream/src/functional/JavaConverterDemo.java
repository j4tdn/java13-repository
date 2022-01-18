package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Functional Interface available in Java
 * + Predicate
 *
 */
public class JavaConverterDemo {
	
	public static void main(String[] args) {
		// Get length of each element in list of String
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
		
		// TO get 'length' of reach element in list of String
		// List<Integer> lengths = convert(elements, string -> string.length());
		List<Integer> lengths = convert(elements, new Converter<>() {
			@Override
			public Integer execute(String s) {
				return s.length();
			}
		});
		
		lengths.forEach(s -> System.out.println(s));
		
		System.out.println("======");
		
		// TO get first character of reach element in list of String
		// List<Character> characters = convert(elements, text -> text.charAt(0));
		List<Character> characters = convert(elements, new Converter<>() {
			@Override
			public Character execute(String s) {
				return s.charAt(0);
			}
		});
		
		characters.forEach(s -> System.out.println(s));
	}
	
	// Using Strategy Pattern - Functional Interface
	// element.length() || element.charAt(0) >> behavior
	// Input: element(String)
	// Output: Length(Integer), char(0)(Character) >> Generic Type: T
	// >>> Functional Interface: Abstract method  >> R execute(String)
	private static <R> List<R> convert(List<String> elements, Converter<R> converter) {
		List<R> result = new ArrayList<>();
		for(String element: elements) {
			result.add(converter.execute(element));
		}
		
		return result;
	}
	
	// Normal Code not using Functional Interface - Strategy Pattern
	
	private List<Integer> toLength(List<String> elements) {
		List<Integer> result = new ArrayList<>();
		for(String element: elements) {
			result.add(element.length());
		}
		
		return result;
	}
	
	private List<Character> toAvatarText(List<String> elements) {
		List<Character> result = new ArrayList<>();
		for(String element: elements) {
			result.add(element.charAt(0));
		}
		
		return result;
	}
}

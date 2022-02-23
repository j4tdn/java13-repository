package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Printable;

/**
 * Functional Interface available in Java
 * + Function
 */
public class JavaConverterDemo {
	public static void main(String[] args) {
		
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
		
		// TO get 'length' of each element in list of String
		// List<Integer> lengths = convert(elements, string -> string.length());
		List<Integer> lengths = convert(elements, new Converter<>() {
			@Override
			public Integer execute(String string) {
				return string.length();
			}
		});
		
		Printable.print(lengths);
		
		
		// TO get first letter of each element in list of String
		// List<Character> firstLetters = convert(elements, text -> text.charAt(0));
		List<Character> firstLetters = convert(elements, new Converter<>() {
			@Override
			public Character execute(String string) {
				return string.charAt(0);
			}
		});
		
		Printable.print(firstLetters);
	}
	
	// Using Strategy Pattern - Functional Interface
	// element.length() || element.charAt(0) >>> behavior
	// Input: element(String)                     >> String
	// Output: length(Integer), chart0(Character) >> Generic Type: T
	
	// >>> Functional Interface: abstract method  >> R execute(String)
	private static <R> List<R> convert(List<String> elements, Converter<R> converter) {
		List<R> result = new ArrayList<>();
		for (String element: elements) {
			result.add(converter.execute(element));
		}
		return result;
	}
	
	
	// Normal Code not using Functional Interface - Strategy Pattern
	
	private List<Integer> toLength(List<String> elements) {
		List<Integer> result = new ArrayList<>();
		for (String element: elements) {
			result.add(element.length());
		}
		return result;
	}
	
	private List<Character> toAvatarText(List<String> elements) {
		List<Character> result = new ArrayList<>();
		for (String element: elements) {
			result.add(element.charAt(0));
		}
		return result;
	}
}

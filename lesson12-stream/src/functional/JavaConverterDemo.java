package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Printable;

public class JavaConverterDemo {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
		
		// TO get 'length' of each element in list of String 
		List<Integer> lengths = convert(elements, new Converter<Integer>() {
			@Override
			public Integer excute(String String) {
				return String.length();
			}
		});
		
		Printable.print(lengths);
		
		// TO get first letter of each element in list of String 
		// List<Character> firtLetters = convert(elements, text -> text.charAt(0));
		List<Character> firtLetters = convert(elements, new Converter<Character>() {
			@Override
			public Character excute(String String) {
				return String.charAt(0);
			}
		});
				
		Printable.print(firtLetters);
	}
	
	// Using Strategy Pattern - Functional Interface
	// element.length() || element.charAt(0) >>> behavior
	// Input: element(String)
	// Output: length(Integer), chart0(Character) >> Generic Type: T
	// >>> Functional Interface : abstract method >> R execute(String)
	private static <R> List<R> convert(List<String> elements, Converter<R> converter) {
		List<R> result = new ArrayList<>();
		for (String element : elements) {
			result.add(converter.excute(element));
		}
		return result;
	}
	
	
	// Normal code not using Functional Interface - Strategy Pattern
	@SuppressWarnings("unused")
	private List<Character> toFirst(List<String> elements) {
		List<Character> result = new ArrayList<>();
		for (String element : elements) {
			result.add(element.charAt(0));
		}
		return result;
	}
	
	@SuppressWarnings("unused")
	private List<Integer> toAvatarText(List<String> elements) {
		List<Integer> result = new ArrayList<>();
		for (String element : elements) {
			result.add(element.length());
		}
		return result;
	}
}

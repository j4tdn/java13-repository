package funtional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import Utils.Printable;

/*
 * Functional Interface available in Java
 * + Function
 */
public class JavaFunctionDemo {
	public static void main(String[] args) {
		// to get length of each element in list of String
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");
		
		// to get length of each element in list of String
		List<Integer> lengths = convert(elements, string -> string.length());
		Printable.print(lengths);
		
		// to get first letter of each element in list of String
		List<Character> firstLetters = convert(elements, string -> string.charAt(0));
		Printable.print(firstLetters);
		
	}
	
	//Normal code not using Funtional Interface(Strategy Pattern)
	private List<Character> toAvatarText(List<String> elements){
		List<Character> result = new ArrayList<>();
		for(String element: elements) {
			result.add(element.charAt(0));
		}
		return result;
	}
	
	private List<Integer> toLength(List<String> elements){
		List<Integer> result = new ArrayList<Integer>();
		for(String element: elements) {
			result.add(element.length());
		}
		return result;
	}
	
	
	// Interface: Function - Strategy parttern
	// element.length() || element.charAt(0) >> behavior
	// input: element(String)
	// output: length(Integer), charAt(0)(Character) >> Generic Type
	// >> Functional Interface: abstract method >> R apply(String)
	private static <E, R> List<R> convert(List<E> elements, Function<E, R> function){
		List<R> result = new ArrayList<>();
		for(E element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
}

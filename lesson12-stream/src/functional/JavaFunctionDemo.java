package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import utils.Printable;

public class JavaFunctionDemo {
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("aaa","bbbb", "ccccc");
		List<Integer> lengths = convert(elements, text -> text.length());
		Printable.print(lengths);
		
		List<Character> firstLetters = convert(elements, text -> text.charAt(0));
		Printable.print(firstLetters);
				
	}
	private static <E,R>List<R> convert(List<E > elements, Function<E, R> function){
		List<R> result = new ArrayList<>();
		for(E element:elements) {
			result.add(function.apply(element));
		}
		
		return result;
	}
}

package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class JavaFunctionDemo {
	public static void main(String[] args) {
		// Get length of each element in list of String
		List<String> elements = Arrays.asList("aaa", "bb", "cccc", "ddd");

		// TO get 'length' of reach element in list of String
		List<Integer> lengths = convert(elements, text -> text.length());

		lengths.forEach(s -> System.out.println(s));

		System.out.println("======");

		// TO get first character of reach element in list of String
		List<Character> characters = convert(elements, text -> text.charAt(0));

		characters.forEach(s -> System.out.println(s));
	}

	private static <E, R> List<R> convert(List<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		for (E element : elements) {
			result.add(function.apply(element));
		}

		return result;
	}

}

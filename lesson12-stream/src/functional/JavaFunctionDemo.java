package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import utils.Printable;

/**
 * Java Available Functional Interface +) Function
 *
 */
public class JavaFunctionDemo {
	public static void main(String[] args) {
		// to get length of each element in List of String
		List<String> demo = Arrays.asList("hello", "trancongviet", "helloworld", "viet");
		System.out.println("LENGTH");
		List<Integer> lengths = filter(demo, str -> str.length());
		Printable.printALL(lengths);
		System.out.println("CHARACTER AT 0");
		List<Character> starts = filter(demo, str -> str.charAt(0));
		Printable.printALL(starts);
	}

	private static <E, R> List<R> filter(List<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		for (E element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
}

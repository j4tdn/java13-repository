package utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListUtils {
	private ListUtils() {

	}

	public static <E> void print(List<E> elements, String string) {
		System.out.println("========================================");
		System.out.println(string);
		for (E element : elements) {
			System.out.println(element);
		}
	}

	public static <E> List<E> suitableElements(List<E> elements, Predicate<E> pre) {
		return elements.stream().filter(element->pre.test(element)).collect(Collectors.toList());
	}
}

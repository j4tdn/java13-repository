package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

	public static <E> List<E> predicate(List<E> elements, Predicate<E> pre) {
		List<E> rs = new ArrayList<>();
		for (E element : elements) {
			if (pre.test(element)) {
				rs.add(element);
			}
		}
		return rs;
	}
}
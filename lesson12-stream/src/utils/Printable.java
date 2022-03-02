package utils;

import java.util.Collection;

public class Printable {
	private Printable() {
		
	}
	// generic type
	public static <E> void printf(Collection<E> elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}

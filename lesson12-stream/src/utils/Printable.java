package utils;

import java.util.Collection;

public class Printable {
	private Printable() {
		
	}
	
	public static <E> void print(Collection<E> elements) {
		for(E element:elements) {
			System.out.println(element);
		}
	}
}

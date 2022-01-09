package utils;

import java.util.List;

public class Printable {
	private Printable() {
		
	}
	
	public static <E> void print(List<E> elements) {
		for(E element:elements) {
			System.out.println(element);
		}
	}
}

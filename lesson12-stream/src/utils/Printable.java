package utils;

import java.util.Collection;

public class Printable {
	private Printable() {
	}
	
	public static <Element> void print(Collection<Element> elements) {
		for (Element element: elements) {
			System.out.println(element);
		}
	}
}

package utils;

import java.util.Collection;

/**
 * Utility class
 * When will we add static into method ?
 */
public class Printable {
	private Printable() {
		
	}
	
	// generic method
	public static <Element> void print(Collection<Element> elements) {
		for(Element element: elements) {
			System.out.println(element);
		}
	}
}

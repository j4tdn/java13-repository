package utils;

import java.util.List;

public class Printable {
	private Printable() {
		
	}
	//generic method
	public static <Element> void print(List<Element> elements) {
		for(Element element : elements) {
			System.out.println(element);
		}
	}
}

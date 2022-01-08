package utils;

import java.util.List;

public class Printable {
	private Printable() {
		
	}
	
	public static <T> void printALL(List<T> things) {
		for(T thing: things) {
			System.out.println(thing);
		}
	}
}

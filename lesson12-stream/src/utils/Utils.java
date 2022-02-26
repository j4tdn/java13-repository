package utils;

import java.util.List;

public class Utils {
	private Utils() {
		// TODO Auto-generated constructor stub
	}
	public static void printf(List<?> objects) {
		for(Object o: objects) {
			System.out.println(o + " ");
		}
	}
}

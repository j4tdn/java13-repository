package utils;

import java.util.List;

/**
 * 
 * 
 * Utility class
 * When will we add static into method ?
 *
 */
public class AppleUtils {
	
	private AppleUtils() {}
	
	public static <E> void print(List<E> list) {
		for(E apple : list) {
			System.out.println(apple);
		}
		System.out.println();
	}
}

package utils;

import java.util.Arrays;

import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void sort(int[] origin, SortOrder order) {
		Arrays.sort(origin);
		if (order == SortOrder.DESC) {
			reverse(origin);
		}
	}
	
	private static void reverse (int[] origin) {
		int[] backup = Arrays.copyOfRange(origin, 0, origin.length);
		
		for (int i = 0; i < origin.length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}
	
	public static void swap(int[] origins, int before, int after) {
		int tmp = origins[before];
		origins[before] = origins[after];
		origins[after] = tmp;
	}
	
	public static void swap(String[] origins, int before, int after) {
		String tmp = origins[before];
		origins[before] = origins[after];
		origins[after] = tmp;
	}
	public static void print(String text, int[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
	
	public static void print(String text, String[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
}
package utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void sort(int[] origin, SortOrder order) {
		// Dual-pivot quick sort with default is ASC
		Arrays.sort(origin);
		if(order == SortOrder.DESC) {
			reverse(origin);
		}
	}
	
	public static void reverse(int[] origin) {
//		int[] backup = Arrays.copyOfRange(origin, 0, origin.length);
		
//		for(int i = 0; i < origin.length; i++) {
//			origin[i] = backup[backup.length - 1 - i];
//		}
		
		for(int i = 0; i < origin.length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[origin.length - i - 1];
			origin[origin.length - i - 1] = tmp;
		}
	}
	
	public static void Swap(int[] origin, int i, int j) {
		int tmp = origin[i];
		origin[i] = origin[j];
		origin[j] = tmp;
	}
	
	public static void Swap(String[] origin, int i, int j) {
		String tmp = origin[i];
		origin[i] = origin[j];
		origin[j] = tmp;
	}
	
	public static void print(String text, int[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
	
	public static void print(String text, String[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
	
	public static void print(String text, Item[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
}

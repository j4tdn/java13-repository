package utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;

public class ArrayUtils {
	private ArrayUtils() {
		
	}
	
	public static void sort(int[] origin, SortOrder order) {
		// Dual-Pivot Quick Sort with default is ASC
		Arrays.sort(origin);
		if(order == SortOrder.DESC) {
			reverse(origin);
		}
	}
	
	public static void reverse(int[] numbers) {
		for(int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i -1];
			numbers[numbers.length - i -1] = tmp;
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
	
	public static void print(String text, Item[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin) );
	}
	
	public static void print(String text, String[] origin) {
		System.out.println(text + ": " + Arrays.toString(origin));
	}
}

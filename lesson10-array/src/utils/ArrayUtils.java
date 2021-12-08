package utils;

import java.util.Arrays;

import common.SortOrder;
import operation.Ex02;

public class ArrayUtils {

	private ArrayUtils() {
	}

	public static void sort(int[] arr, SortOrder order) {
		// Dual-Pivot Quick sort with default is ASC
		Arrays.sort(arr);
		if(order == SortOrder.DESC) {
			Ex02.reverse(arr);
		}
	}

	public static void swap(int[] origin, int before, int after) {
		int tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}
	
	public static void swap(String[] origin, int before, int after) {
		String tmp = origin[before];
		origin[before] = origin[after];
		origin[after] = tmp;
	}


	public static void printf(String text, int[] arr) {
		System.out.println(text + ": " + Arrays.toString(arr));
	}
}

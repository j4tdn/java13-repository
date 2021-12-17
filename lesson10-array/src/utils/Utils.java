package utils;

import java.util.Arrays;

import bean.Item;
import common.SortOrder;

public class Utils {
	private Utils() {
	}

	public static void sort(int[] origin, SortOrder order) {
		// Dual-Pivot quicksort with default is ASC
		Arrays.sort(origin);
		if (order == SortOrder.DESC) {
			reversed(origin);
		}
	}

	public static void swap(int[] numbers, int i, int j) {
		int tmp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = tmp;
	}

	public static void swap(String[] students, int i, int j) {
		String tmp = students[i];
		students[i] = students[j];
		students[j] = tmp;
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

	public static void reversed(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
	}
}

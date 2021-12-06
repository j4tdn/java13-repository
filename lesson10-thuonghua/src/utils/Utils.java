package utils;

import java.util.Arrays;

public class Utils {
	private Utils() {

	}

	public static int[] deleteDuplicates(int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int k = numbers[i];
				int g = numbers[j];
				if (k == g) {
					count++;
					if (count >= 1) {
						count = 1;
						numbers = delete(numbers, j);
						j--;
					}
				}
			}
		}
		return numbers;
	}
	
	public static int[] delete(int[] numbers, int k) {
		int[] array = Arrays.copyOfRange(numbers, 0, numbers.length);

		for (int i = k; i < numbers.length - 1; i++) {
			array[i] = array[i + 1];
		}
		return Arrays.copyOfRange(array, 0, array.length - 1);
	}
	
	public static int[] sort(int[] numbers, Strategy strategy) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (strategy.check(numbers[j], numbers[j + 1])) {
					Utils.swap(numbers, j, j + 1) ;
				}
			}
		}
		return numbers;
	}
	
	public static String[] removeElement(String[] str, int pos) {
		String[] result = new String[str.length - 1];
		for (int i = 0; i < str.length; i++) {
			if (i < pos) {
				result[i] = str[i];
			} else if (i > pos) {
				result[i - 1] = str[i];
			}
		}
		return result;
	}
	
	public static void swap(int[] numbers, int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}
}

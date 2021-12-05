package ex01;

import java.util.Arrays;

/**
 * Application 1: Remove the duplicated elements in an array
 */
public class App_1 {
	public static void main(String[] args) {
		int[] origin = { 1, 2, 3, 4, 3, 1 };

		System.out.println("Original array: " + Arrays.toString(origin));

		Arrays.sort(origin, 0, origin.length);
		int[] result = new int[origin.length];

		int j = 0;
		int i = 1;

		while (i < origin.length - 1) {
			if (origin[i] != origin[i - 1] && origin[i] != origin[i + 1]) {
				result[j] = origin[i];
				j++;
			}
			i++;
		}

		if (origin[i] != origin[i - 1]) {
			result[j] = origin[i];
		}

		System.out.println(
				"Array after removing duplicated elements: " + Arrays.toString(Arrays.copyOfRange(result, 0, j + 1)));
	}
}

package ex01;

import java.util.Arrays;

/**
 * Find the number with value is 3rd descending in an array
 */
public class App_3 {
	public static void main(String[] args) {
		int[] origin = { 7, 8, 8, 8, 6, 2, 5, 1 };
		Arrays.sort(origin, 0, origin.length);

		int result = origin[origin.length - 1];
		int j = 0;

		for (int i = origin.length - 1; i > 0; i--) {
			if (origin[i] > origin[i - 1]) {
				j++;

				if (j == 3) {
					result = origin[i];
					break;
				}
			}
		}

		System.out.println("The number with value is 3rd descending in the array is: " + result);
	}
}

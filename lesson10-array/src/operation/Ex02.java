package operation;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		reverse(numbers);

		System.out.println("Reversed array: " + Arrays.toString(numbers));
	}

	private static void reverse(int[] origin) {
		int length = origin.length;

		for (int i = 0; i < length / 2; i++) {
			int tmp = origin[i];
			origin[i] = origin[length - i - 1];
			origin[length - i - 1] = tmp;
		}

	}
}

package operation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 8,  3, 9, 4, 5, 10, 6 };
		reversed(numbers);
		System.out.println("Reversed: " + Arrays.toString(numbers));
	}

	private static void reversed(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
	}
}

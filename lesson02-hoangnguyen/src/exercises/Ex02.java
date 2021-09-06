package exercises;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int result = sumOfNumbers(4) + sumOfNumbers(7) + sumOfNumbers(12) + sumOfNumbers(18);
		System.out.println(result);
	}

	private static int sumOfNumbers(int number) {
		int result = 1;

		for (int i = number; i > 0; i--) {
			result *= i;
		}
		return result;

	}
}

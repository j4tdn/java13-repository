package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input numbers of array: ");
		int n = Integer.parseInt(sc.nextLine());
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = new Random().nextInt(100);
			System.out.println("number[" + i + "] = " + numbers[i]);
		}

		int result = maxOddNumber(numbers);

		System.out.println(result + " is the biggest odd number");
	}

	private static int maxOddNumber(int[] numbers) {
		int maxOdd = numbers[0];

		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i + 1] > maxOdd) {
				if (numbers[i + 1] % 2 != 0) {
					maxOdd = numbers[i + 1];
				}
			}
		}

		return maxOdd;
	}
}

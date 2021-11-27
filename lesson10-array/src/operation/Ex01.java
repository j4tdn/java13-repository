package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		int sumOfOdd = sum(numbers, a -> a % 2 != 0);
		System.out.println("sum: " + sumOfOdd);
		Tuple minMaxTuple = maxMin(numbers);
		System.out.println("minMaxTuple: " + minMaxTuple);
		int[] newArray = addElement(numbers, 5, 18);
		System.out.println(Arrays.toString(newArray));
	}

	// 3.Add element
	private static int[] addElement(int[] numbers, int k, int value) {

		int[] newNumbers = new int[numbers.length + 1];
//		int i = 0;
//		for (int j = 0; j < newNumbers.length; j++) {
//			if (j == k) {
//				newNumbers[j] = value;
//			} else {
//				newNumbers[j] = numbers[i++];
//			}
//
//		}
		for (int i = 0; i < numbers.length; i++) {
			newNumbers[i] = numbers[i];
		}
		for (int j = newNumbers.length - 1; j > k; j--) {
			newNumbers[j] = newNumbers[j - 1];
		}
		newNumbers[k] = value;
		return newNumbers;
	}

	// 2.Find maximum, minimum in one loop
	private static Tuple maxMin(int[] numbers) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		return new Tuple(max, min);
	}

	// 1.Calculate sum of odd numbers
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for (int i : numbers) {
			if (strategy.excute(i)) {
				sum += i;
			}
		}
		return sum;
	}
}

package ex01;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] numbers = { 7, 8, 8, 8, 6, 2, 5, 1 };
		System.out.print("numbers: ");
		log(numbers);
		int[] rmDupElements = removeDuplicateElements(numbers);
		System.out.print("removed duplicate elements: ");
		log(rmDupElements);
		System.out.print("compare Avg[0,n/2] & Avg[n/2,n]: ");
		compareTwoMeans(numbers);
		System.out.println("\n=============\\\\\\================\n");
		try {
			System.out.println("the 3rd largest number in arrays: " + theNthLargestNumber(numbers, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int theNthLargestNumber(int[] numbers, int n) throws Exception {
//		int firstMax = Integer.MIN_VALUE;
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] > firstMax) {
//				firstMax = numbers[i];
//			}
//		}
//		int secondMax = Integer.MIN_VALUE;
//		for (int i = 0; i < numbers.length; i++) {
//			if ((numbers[i] > secondMax) && (numbers[i] < firstMax)) {
//				secondMax = numbers[i];
//			}
//		}
//		int thirdMax = Integer.MIN_VALUE;
//		for (int i = 0; i < numbers.length; i++) {
//			if ((numbers[i] > thirdMax) && (numbers[i] < secondMax)) {
//				thirdMax = numbers[i];
//			}
//		}

		// n : the n-th of largest number
		if (n > numbers.length) {
			throw new Exception("Incorrect value of the rank of the largest numbers!");
		}
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int MAX = Integer.MIN_VALUE;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] > MAX && numbers[j] < max) {
					MAX = numbers[j];
				}
			}
			max = MAX;
		}
		return max;
	}

	private static void compareTwoMeans(int[] numbers) {
		// input the index
		double first = meanOfNElements(numbers, 0, numbers.length / 2);
		double second = meanOfNElements(numbers, numbers.length / 2, numbers.length);
		if (first > second) {
			System.out.println(first + " > " + second);
		} else {
			System.out.println(first + " < " + second);
		}
	}

	private static double meanOfNElements(int[] numbers, int start, int end) {
		return Arrays.stream(Arrays.copyOfRange(numbers, start, end)).average().orElse(Double.NaN);
	}

	private static void log(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
		System.out.println("\n=============\\\\\\================\n");
	}

	private static int[] removeDuplicateElements(int[] numbers) {
		boolean[] existed = new boolean[numbers.length];
		int[] result = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (j != i && numbers[j] == numbers[i]) {
					existed[i] = true;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (!existed[i]) {
				result[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}

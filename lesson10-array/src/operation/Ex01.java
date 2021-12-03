package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println("numbers" + Arrays.toString(numbers));
		int sumOfOdd = sum(numbers, a -> a % 2 != 0);
		System.out.println("===============================");
		System.out.println("sum: " + sumOfOdd);
		Tuple minMaxTuple = maxMin(numbers);
		System.out.println("===============================");
		System.out.println("minMaxTuple: " + minMaxTuple);
		System.out.println("===============================");
		int[] newAddedArray = addElement(numbers, 5, 18);
		System.out.println("addElentment: " + Arrays.toString(newAddedArray));
		System.out.println("numbers: " + Arrays.toString(numbers));
		System.out.println("===============================");
		int[] newRemovedArray1 = delete(numbers, 3);
		System.out.println("removeElement: " + Arrays.toString(newRemovedArray1));
		System.out.println("===============================");
		int[] newRemovedArray2 = remove(numbers, 2);
		System.out.println("removeElement: " + Arrays.toString(newRemovedArray2));
		System.out.println("===============================");
	}

	// 4.2 Remove element from index k
	private static int[] remove(int[] numbers, int k) {
		int[] result = new int[numbers.length - 1];
		for (int i = 0; i < k; i++) {
			result[i] = numbers[i];
		}
		for (int i = k; i < result.length; i++) {
			result[i] = numbers[i + 1];
		}
		return result;
	}

	// 4.1 Remove element from index k
	private static int[] delete(int[] origin, int k) {
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		for (int i = k; i < origin.length - 1; i++) {
			result[i] = result[i + 1];
		}

		return Arrays.copyOfRange(result, 0, result.length - 1);
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

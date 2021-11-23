package ex01;

import java.util.Arrays;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		int A[] = { 3, 7, 9, 2, 1, 8, 5, 4, 10 };
		System.out.println("Số còn thiếu trong mảng A là: " + getMissingNumber(A));
	}

	private static int getMissingNumber(int[] A) {
		// Với giá trị từ 1 đến n
		// missing number = n * (n + 1) - sum(array with missing number)
		// VD: n = 5, array = {1,2,4,5}
		// missing = 5 * 6 / 2 - (1 + 2 + 4 + 5) = 3

		// sum of array from 1 - n
		int sum = (A[A.length - 1] * (A[A.length - 1] + 1)) / 2;
		// sum of array have missing number
		int sumOfMissingArray = findSumUsingStream(A);

		return sum - sumOfMissingArray;
	}

	private static int findSumUsingStream(int[] A) {
		return Arrays.stream(A).sum();
	}
}

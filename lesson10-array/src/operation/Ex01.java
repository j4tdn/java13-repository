package operation;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		int sumOfOddElms = sum(numbers, number -> number % 2 != 0);
		System.out.println("sumOfOddElms: " + sumOfOddElms);
		
		System.out.println("newRemoveArray: " + Arrays.toString(remove(numbers, 3)));
		System.out.println("newDeleteArray: " + Arrays.toString(delete(numbers, 3)));
	}
	
	private static int[] delete(int[] origin, int k) {
		int[] result = Arrays.copyOfRange(origin, 0, origin.length);
		for (int i = k; i < result.length - 1; i++) {
			result[i] = result[i+1];
		}
		return Arrays.copyOfRange(origin, 0, origin.length - 1);
		
	}
	
	private static int[] remove(int[] origin, int k) {
		if (k < 0 || k > origin.length - 1) {
			throw new IllegalArgumentException(k + " is out of range(0," + (origin.length - 1) + ")");
		}
		
		int[] result = new int[origin.length - 1];
		
		for (int i = 0; i < k; i++) {
			result[i] = origin[i];
		}
		for (int i = k; i < result.length; i++) {
			result[i] = origin[i+1];
		}
		return result;
	}
	
	private static int sum(int[] numbers, Strategy strategy) {
		int sum = 0;
		for (int number : numbers) {
			if (strategy.execute(number)) {
				sum += number;
			}
		}
		return sum;
	}
}

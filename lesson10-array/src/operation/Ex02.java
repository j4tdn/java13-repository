package operation;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 3, 6, 5, 9};
		reverse(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void reverse(int[] numbers) {
		for(int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[numbers.length - i -1];
			numbers[numbers.length - i -1] = tmp;
		}
	}
	
	
}

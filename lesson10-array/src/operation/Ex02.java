package operation;

import java.util.Arrays;

import utils.Utils;

public class Ex02 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 8,  3, 9, 4, 5, 10, 6 };
		Utils.reversed(numbers);
		System.out.println("Reversed: " + Arrays.toString(numbers));
	}

	
}

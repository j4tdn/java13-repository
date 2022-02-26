package view.primitive.stream;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// List<Integer>#stream ==> Stream<Integer>
		// int[] Arrays.stream ==> IntStream
		// double, long
		
		int[] digits = {1, 2, 3, 4};
		int sum = Arrays.stream(digits)
						.filter(digit -> digit % 2 == 0)
						.sum();
		System.out.println("sum: " + sum);
	}
}

package view.primitive.stream;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// List<Integer>#stream ==> Stream<Integer>
		// int[] Arrays.stream  ==> IntStream
		//double, long
		
		int[] digits = {1, 2, 4, 6, 3};
		int sum = Arrays.stream(digits)
					.filter(d -> d % 2 == 0)
					.sum();
		System.out.println("sum: " + sum);
	}
}

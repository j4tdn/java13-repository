package viw.primitive.stream;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// List<Integer>.stream() ==> Stream<Integer>
		// int[] Arrays.stream(int[]) ==> IntStream
		// double, long

		int[] numbers = { 1, 2, 3, 4 };
		int sum = Arrays.stream(numbers)
						.filter(number -> number % 2 == 0)
						.sum();
		
		System.out.println("Sum: " + sum);
		
	}
}

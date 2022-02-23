package view.stream;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 2, 3, 1, 4);

		// find all even elements 
		/*
		 * Integer[] result = numbers.stream().filter(number -> number % 2 == 0).toArray(new IntFunction<Integer[]>() {

			@Override
			public Integer[] apply(int length) {
				return new Integer[length];
			}
		});
		*/
		
		// Integer[] result = numbers.stream().filter(number -> number % 2 == 0).toArray(length -> new Integer[length]);
		
		Integer[] result = numbers.stream().filter(number -> number % 2 == 0).distinct().toArray(Integer[]::new);
		
		Arrays.stream(result).forEach(System.out::println);

	}
}

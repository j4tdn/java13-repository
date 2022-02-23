package view.stream;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 2, 3, 1, 4);
		
		// find even elements
		
		// length --> new Integer[length] >> constructor reference 
		// length -> new Integer[length]
		// Integer[]::new
		Integer[] result = numbers.stream()
			   .filter(number -> number % 2 == 0)
			   .distinct()
			   .toArray(Integer[]::new);
		Arrays.stream(result)
		.forEach(System.out::println);
	}
}

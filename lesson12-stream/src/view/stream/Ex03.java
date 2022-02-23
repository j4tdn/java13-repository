package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 2, 3, 1, 4);

		// find all even elements and distinct
		/*Integer[] result = numbers.stream() // Stream<Integer>
				.filter(number -> number % 2 == 0) // Stream<Integer>
				.toArray(new IntFunction<Integer[]>() {
					@Override
					public Integer[] apply(int length) {
						return new Integer[length];
					}
				});*/
		
		// length -> new Integer[length] >>> constructor reference
		// id -> new Apple(id) ==> Apple::new
		// Integer[]::new
		Integer[] result = numbers.stream() // Stream<Integer>
				.filter(number -> number % 2 == 0) // Stream<Integer>
				.distinct()
				.toArray(Integer[]::new);
		
		// .collect(Collectors.toSet())
		
		Arrays.stream(result) // Stream<Integer>
			  .forEach(System.out::println);
	}
}

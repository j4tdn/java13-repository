package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Ex12 {
	public static void main(String[] args) {

		// Return Interger
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 4, null, 8, 20, null);

		Integer sum = numbers.stream().filter(x -> Objects.nonNull(x)) // Stream<Integer>
				.reduce(0, Integer::sum);
		// Integer::sum
		System.out.println("sum = " + sum);

		// Return Optional
		Optional<Integer> opt = numbers.stream().filter(x -> Objects.nonNull(x)).reduce(Integer::sum);
		opt.ifPresent(value -> System.out.println("value: " + value));
		if (opt.isPresent()) {
			System.out.println("value: " + opt.get());
		}

		/*
		 * NullPointerException => .intValue()
		 */
		Integer max = numbers.stream().filter(x -> Objects.nonNull(x)) // Stream<Integer>
				.reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

		System.out.println("max: " + max);
	}
}

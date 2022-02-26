package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Ex12 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, null, 3, 4, 5);

		Integer sum = numbers.stream()
							 .filter(Objects::nonNull)// Stream<Integer>
							 .reduce(0, Integer::sum); // Integer

		System.out.println("sum; " + sum);

		// 1 + null
		// Integer, null
		// .intValue() 1 + null.intValue() auto-unboxing --> nullPointerException

		// Integer:;sum ==> (a ,b) -> a + b
		Optional<Integer> opt = numbers.stream().filter(Objects::nonNull).reduce((a, b) -> a + b);
		opt.ifPresent(System.out::println);

		// Find max
		Integer max = numbers.stream()
							 .filter(number -> Objects.nonNull(number))
							 .reduce(Integer.MIN_VALUE, (initialMax, elemnent) -> {
								 	return elemnent > initialMax ? elemnent : initialMax;
							 });

		System.out.println("max: " + max);
	}

}

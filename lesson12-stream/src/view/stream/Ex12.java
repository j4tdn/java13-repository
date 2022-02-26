package view.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 15, 2,null, null, 3);

		Integer sum = numbers.stream() // Stream<Integer>
				.filter(Objects::nonNull)
				.reduce(0, new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer a, Integer b) {
						return a + b;
					}
				});
		System.out.println("sum1: " + sum);
		
		// 1 + null
		// Integer, null
		// .intValue() 1 + null.intValue() auto-unboxing
		
		// Integer::sum ==> (a, b) -> a + b;
		Optional<Integer> opt = numbers.stream()
				.filter(Objects::nonNull)
			    .reduce(Integer::sum);
		opt.ifPresent(value -> System.out.println("sum2: " + value));
		
		// Find Max
		Integer max = numbers.stream()
			   .filter(Objects::nonNull)
			   .reduce(Integer.MIN_VALUE, (initialMax, element) -> {
				   return element > initialMax ? element : initialMax;
			   });
		System.out.println("max: " + max);
	}
}

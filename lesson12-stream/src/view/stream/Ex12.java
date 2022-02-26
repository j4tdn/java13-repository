package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, null, null, 3, 5, 7, 4);
		
		Integer sum = numbers.stream()
			   .filter(Objects::nonNull)
			   .reduce(0, new BinaryOperator<Integer>() {
				   @Override
				public Integer apply(Integer a, Integer b) {
					return a + b;
				}
			});
		System.out.println("sum1: " + sum);
		
		// Integer::sum ==> (a, b) -> a + b
		Optional<Integer> opt = numbers.stream()
			   .filter(Objects::nonNull)
			   .reduce(Integer::sum);
		opt.ifPresent(value -> System.out.println("sum2: " + value));
		
		// Find Max
		Integer max = numbers.stream()
			   .filter(Objects::nonNull)
			   .reduce(Integer.MIN_VALUE, (initialMax, element) -> {
				   return initialMax > element ? initialMax : element;
			   });
		System.out.println("max: " + max);
	}
}

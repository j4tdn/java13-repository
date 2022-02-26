package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 7, 5, 4);
		Integer sum = numbers.stream()
				.filter(Objects::nonNull)
			   .reduce(0, new BinaryOperator<Integer>() {
				   @Override
				public Integer apply(Integer t, Integer u) {
					return t + u;
				}
			});
		System.out.println("sum: " + sum);
		Optional<Integer> opt = numbers.stream()
				   .filter(Objects::nonNull)
				   .reduce(Integer::sum);
		opt.ifPresent(value -> System.out.println("sum2: " + value));
		
		Integer max = numbers.stream()
				       		 .filter(Objects::nonNull)
							 .reduce(Integer.MIN_VALUE,(a,b) -> a < b ? b : a);
		System.out.println("max: " + max);
		
	}
}

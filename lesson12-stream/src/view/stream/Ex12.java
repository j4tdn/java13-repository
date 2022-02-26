package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static <T> void main(String[] args) {
		List<Integer> numbers = Arrays.asList(null, 1, 3, 4, 5, 7);
		Integer sum = numbers.stream()
						.filter(Objects::nonNull)
						.reduce(0, new BinaryOperator<Integer>() {
							@Override
							public Integer apply(Integer a, Integer b) {
								return a + b;
							}
						});
		System.out.println("sum: " + sum);

		Optional<Integer> optsum = numbers.stream()
										.filter(n -> n != null)  //Objects::nonNull
										.reduce((a, b) -> a + b); //Integer::sum
		optsum.ifPresent(value -> System.out.println("sum2:" + value));
		
		//find max
		Integer max = numbers.stream()
			.filter(Objects::nonNull)
			.reduce(Integer.MIN_VALUE, (a, b) -> {
				return a > b ? a : b;
			}); 
		System.out.println("max: " + max);
	}
}

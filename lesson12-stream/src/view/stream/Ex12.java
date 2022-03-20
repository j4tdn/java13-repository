package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 4);
		
		Integer sum = numbers.stream()
			   .reduce(0, new BinaryOperator<Integer>() {
				   @Override
				public Integer apply(Integer a, Integer b) {
					return a + b;
				}
			   });
		System.out.println("sum = " + sum);
		
		Optional<Integer> opt = numbers.stream()
			    .filter(number -> number != null)
				.reduce(Integer::sum);
		opt.ifPresent(value -> System.out.println("sum2 = " + value));
		
		Integer max = numbers.stream()
			   .filter(number -> number != null)
			   .reduce(Integer.MIN_VALUE, (Max, e) -> Max<e?e:Max);
		System.out.println("max : " + max);
	}
}

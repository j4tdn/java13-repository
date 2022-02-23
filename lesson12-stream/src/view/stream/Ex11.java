package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 6, 10, 2, 4, 20, 11);
		boolean matchDivisibleBy10 = numbers.stream()
								     .anyMatch(number -> number % 10 == 0);
		System.out.println("matchDivisibleBy10: " + matchDivisibleBy10);
		Optional<Integer> opt = numbers.stream()
			   .filter(number -> number % 4 == 0)
			   .findFirst();
//		System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		opt.ifPresent(value -> System.out.println(value));
		
		System.out.println(opt.orElse(Integer.MAX_VALUE));
		
		Optional<Integer> optDiv5 = numbers.stream()
		 .filter(number -> number % 5 == 0)
		 .findAny();
		System.out.println(optDiv5.orElse(9999999));
		
		boolean optG5 = numbers.stream()
				 .allMatch(number -> number > 100);
		System.out.println(optDiv5.orElse(9999999));
	}
}

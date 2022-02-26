package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1
				, 2, 1, 4, 5, 8, 103, 4, 12);
		
		Boolean matchDivisibleBy10 = numbers.stream()
			.anyMatch(number -> number % 10 == 0);
		System.out.println("ExistDivvisibleBy10: " + matchDivisibleBy10);
		
		System.out.println("==============");
		
		Optional<Integer> opt = numbers.stream()
									.filter(number -> number % 40 == 0)
									.findFirst();
//		System.out.println(opt.get());
//		
//		 System.out.println(opt.get());
//		if(opt.isPresent()) {
//			System.out.println(opt.get());
//		}
//		
		opt.ifPresent(value -> System.out.println(value));
		
//		System.out.println(opt.orElse(Integer.MAX_VALUE));
		
		System.out.println("==============");
		
		Optional<Integer> optDiv5 = numbers.stream()
			.filter(number -> number % 2 == 0)
			.findAny();
		System.out.println("optDiv5: " + optDiv5.orElse(999));
		
		System.out.println("==============");
		
		System.out.println(numbers.stream()
			.allMatch(n -> n < 100));
		
		System.out.println(numbers.stream()
				.noneMatch(n -> n > 0));
				
	}
}

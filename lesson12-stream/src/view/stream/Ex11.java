package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,1,4,5,8,10,4,12);
		
		boolean existDivisibleBy10 = numbers.stream()
											.anyMatch(number -> number % 10 == 0);
		System.out.println("existDivisibleBy10: " + existDivisibleBy10);
		
		// Optional: Java08 >> reduce cause of exception
		
		// Optional<T>
		// Optional: Container of T, never null
		Optional<Integer> existDivisibleBy4 = numbers.stream()
			   .filter(number -> number % 4 == 0)
			   .findFirst();
		
		if(existDivisibleBy4.isPresent()) {
			System.out.println(existDivisibleBy4.get());
		}
		
		existDivisibleBy4.ifPresent(System.out::println);
		System.out.println(existDivisibleBy4.orElse(Integer.MAX_VALUE));
		
		Optional<Integer> existDivisibleBy5 = numbers.stream().filter(number -> number % 5 == 0)
						.findAny();
		
		System.out.println(existDivisibleBy5.orElse(999));
		
		numbers.stream().allMatch(number -> number % 10 == 0);
	}
}

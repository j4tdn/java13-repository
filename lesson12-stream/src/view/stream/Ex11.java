package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
   --> allMatch, anyMatch, noneMatch, findFist, findAny
   --> Predicate
   
   1st: is there any element that is divisible by 10
   2nd: find the first element that is divisible by 4
   3nd: find the element that is divisible by 5 in the list
   4th: does all elements less than 100 -->> allMatch
   5th: does no elements greater than 0 -->> noneMatch
 */
public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 8, 10, 4, 12);
		
		boolean existDivisibleBy10 = numbers.stream()
											.anyMatch(number -> number % 10 == 0);
		System.out.println("existDivisibleBy10: " + existDivisibleBy10);
		
		// Optional: Java08 >> reduce cause of exception
		
		// Optional<T> 
		// Optional: Container of T, never null
		
		Optional<Integer> opt = numbers.stream()
			   .filter(number -> number % 7 == 0)
			   .findFirst();
		
		// System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		opt.ifPresent(value -> System.out.println(value));
		System.out.println(opt.orElse(Integer.MAX_VALUE));
		
		Optional<Integer> optDiv5 = numbers.stream()
				   .filter(number -> number % 5 == 0)
				   .findAny();
		System.out.println(optDiv5.orElse(999));
		
	}
}

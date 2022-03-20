package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 4, 5, 8, 10, 4, 12);
		// 1st: is there any element that is divisible by 10
		boolean existDevisibleBy10 = numbers.stream()
											.anyMatch(number -> number % 10 == 0);
		System.out.println("existDevisibleBy10 : " + existDevisibleBy10);
		// 2nd: find the first element that is divisible by 4
		// Optional: Java08 >> reduce cause of exception
		// Optional<T>
		// Optional: Container of T, never null
		Optional<Integer> opt = numbers.stream()
			   .filter(number -> number % 4 == 0)
			   .findFirst();
		// System.out.println(opt.get());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		opt.ifPresent(value -> System.out.print(value));
		System.out.println(opt.orElse(Integer.MAX_VALUE));
		// 3nd: find the element that is divisible by 5 in the list
		Optional<Integer> optDiv5 = numbers.stream()
			   .filter(number -> number % 5 == 0)
			   .findAny();
		System.out.println(optDiv5.orElse(999));
		// 4th: does all elements less than 100
		// 5th: does no elements greater than 0
	}
}

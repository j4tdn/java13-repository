package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 22, 62, 14, 730, 9, 10);

		System.out.println("exist Divisible By 10: " + numbers.stream().anyMatch(number -> number % 10 == 0));
		
		System.out.println(
				"first element divisible by 4: " + numbers.stream().filter(number -> number % 4 == 0).findFirst());
		Optional<Integer> opt1 = numbers.stream().filter(number -> number % 4 == 0).findFirst();
		if (opt1.isPresent()) {
			System.out.println(opt1.get());
		}
		opt1.ifPresent(value -> System.out.println(value));
		System.out.println(opt1.orElse(Integer.MAX_VALUE));

		System.out.println("element divisible by 5: " + numbers.stream().filter(number -> number % 5 == 0).findAny());
		Optional<Integer> opt2 = numbers.stream().filter(number -> number % 5 == 0).findAny();
		if (opt2.isPresent()) {
			System.out.println(opt2.get());
		}
		opt2.ifPresent(value -> System.out.println(value));
		System.out.println(opt2.orElse(Integer.MAX_VALUE));
		
		System.out.println("all elements less than 100: " + numbers.stream().allMatch(number -> number < 100));
		System.out.println("no elemenents greater than 0: " + numbers.stream().noneMatch(number -> number > 0));

	}
}

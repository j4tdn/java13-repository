package view.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ex07 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 7, 3, 9, 2, 4, 9, 7);
		System.out.println("Largest number: ");
		numbers.stream()
		.sorted(Comparator.comparing(Function.identity(), Comparator.reverseOrder()))
		.distinct()
		.limit(3)
		//.skip(numbers.size()-6)
		.forEach(System.out::println);
		
		
	}
}

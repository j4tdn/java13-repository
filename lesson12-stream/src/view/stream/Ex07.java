package view.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex07 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 8, 2, 9, 4, 5, 9, 9);
		// Get third largest numbers
		List<Integer> result = numbers.stream()
			   .sorted(Comparator.comparing(Function.identity(), Comparator.reverseOrder()))
			   .distinct()
			   .limit(3)
			   .collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}
	

}

package view.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex07 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 7, 3, 9, 2, 4, 7, 9);
		
		// Get first largest numbers
		List<Integer> result = numbers.stream()
			   .sorted(Comparator.comparing(Function.identity(), Comparator.reverseOrder()))
			   .distinct()
			   .limit(3)
			   .collect(Collectors.toList());
		result.forEach(System.out::println);  
	}
}

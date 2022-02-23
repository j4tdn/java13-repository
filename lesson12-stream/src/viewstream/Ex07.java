package viewstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex07 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,4,7,5,335,3,5);
		
		
		List<Integer> result = numbers.stream()
			.sorted(Comparator.comparing(Function.identity(), Comparator.reverseOrder()))
			.limit(3)
			.collect(Collectors.toList());
			
		result.forEach(System.out::println);
	}
}

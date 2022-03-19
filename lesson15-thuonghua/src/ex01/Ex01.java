package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 3, 5);

		List<Integer> result = numbers.stream()
				   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
				   .entrySet()
			       .stream()  
			       .filter(entry -> entry.getValue() == 1)
			       .map(entry -> entry.getKey()) 
			       .collect(Collectors.toList());
		
			result.forEach(System.out::println);
	}
}

package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 3, 2, 6, 3, 1, 4, 2);
		
		// get unique elements from list of numbers >> 6, 4
		
		// Option 1: Manually execute 
		
		// Option 2: Using groupBy method in Stream
		System.out.println("Unique elements ....");
		List<Integer> statDigits = numbers.stream() // Stream<Integer>
			   .collect(Collectors.groupingBy(number -> number, Collectors.counting())) // Map<K, V>
			   .entrySet() // Set<Entry<K, V>>
			   .stream() // Stream<Entry<K, V>>
			   .filter(entry -> entry.getValue() == 1)
			   .map(entry -> entry.getKey())
			   .collect(Collectors.toList());
		statDigits.forEach(System.out::println);
	}
	
//	private static Map<Integer, Integer> statistic(List<Integer> numbers) {
//		
//	}
}	

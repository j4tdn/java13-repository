package view.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 3, 2, 3, 1, 4);
		// get unique elements from list of numbers >> 6, 4

		// Option1: Manually execute
		Map<Integer, Integer> statNbers = statistic(numbers);
		System.out.println(statNbers);

		// Option2: Using groupBy
	
		 Map<Integer, Long> statDigits = numbers.stream()
		 
				.collect(Collectors.groupingBy(number -> number, Collectors.counting()));

		System.out.println(statDigits);

		List<Integer> uniqueElements = statDigits.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		
		
		
//		List<Integer> uniqueElements = numbers.stream() // Stream<Integer>
//				.collect(Collectors.groupingBy(number -> number, Collectors.counting())) // Map<K,V>
//				.entrySet() // Set<Entry<K,V>>
//				.stream() // Stream<Entry<K,V>>
//				.filter(entry -> entry.getValue() == 1)
//				.map(entry -> entry.getKey()) // Stream<K>
//				.collect(Collectors.toList()); // List<K>
//		System.out.println("Unique elements .... ");
//		uniqueElements.forEach(System.out::println);

	}

	private static Map<Integer, Integer> statistic(List<Integer> numbers) {
		Map<Integer, Integer> counter = new HashMap<>();
		for (Integer number : numbers) {
			if (!counter.containsKey(number)) {
				counter.put(number, 1);
			} else {
				counter.replace(number, counter.get(number) + 1);
			}
		}
		return counter;
	}
}

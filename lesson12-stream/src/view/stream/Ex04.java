package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 3, 2, 3, 1, 4);
		
		// get unique elements from list of numbers >>> 6, 4
		
		// Option 2: Using groupBy method in Stream
		Map<Integer, Long> statDigits = numbers.stream()
			   .collect(Collectors.groupingBy(number -> number, Collectors.counting())); // Map<K, V>
		System.out.println(statDigits);
		
		System.out.println("Unique elements ... ");
		statDigits.entrySet() // Set<Entry<K,V>>
				  .stream() // Stream<Entry<K,V>>
				  .filter(entry -> entry.getValue() == 1)
				  .map(entry -> entry.getKey())
				  .collect(Collectors.toList())
				  .forEach(System.out::println);
	}
	
	private static Map<Integer, Integer> statistic(List<Integer> numbers){
		return null;
		// not done
	}
    
}

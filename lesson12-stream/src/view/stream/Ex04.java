package view.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 2, 3, 1, 4);
		// get unique elements from list of numbers >> 6,4
		
		// element, number of appearance
		Map<Integer, Integer> statNber = statistic(numbers);
		System.out.println(statNber);
		
		//Opt2:
		Map<Integer, Long> statDigits =  numbers.stream()
		       .collect(Collectors.groupingBy(number -> number, Collectors.counting()));
		System.out.println(statDigits);
		System.out.println("Unique elements ....");
		List<Integer> uniqueElements =  statDigits.entrySet()
			      .stream()
			      .filter(entry -> entry.getValue() == 1)
			      .map(entry -> entry.getKey())
			      .collect(Collectors.toList());
		
		uniqueElements.forEach(System.out::println);
		
		
		
		
		
		
		}
	private static Map<Integer, Integer> statistic(List<Integer> numbers){
		// Entry >> K element, V number of appearance
		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		for(Integer number : numbers) {
			if(! counter.containsKey(number)) {
				counter.put(number, 1);
			} else {
				counter.replace(number, counter.get(number) + 1);
			}
		}
		return counter;
	}
}

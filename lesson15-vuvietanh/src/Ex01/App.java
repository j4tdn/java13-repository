package Ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList( 2, 4, 3, 5, 7, 12, 2, 3, 5, 9 );
		List<Integer> result = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		System.out.println("====================");
		
		List<Integer> uniqueElements = numbers.stream()
				   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
				   .entrySet()
				   .stream()
				   .filter(entry -> entry.getValue() > 1)
				   .map(entry -> entry.getKey()) 
				   .collect(Collectors.toList()); 
			
			System.out.println(uniqueElements);
		 
}
}

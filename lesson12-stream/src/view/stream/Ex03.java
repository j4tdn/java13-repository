package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 3, 3, 2, 6, 3, 1, 4, 2);
		
		// find all even elements
		/*Integer[] result = numbers.stream() // Stream<Integer>
			   .filter(number -> number % 2 == 0)
			   .toArray(new IntFunction<Integer[]>() {
				   @Override
				   public Integer[] apply(int length) {
					   return new Integer[length];
				   };
			});*/
		
		// length -> new Integer[length] >>> constructor references
		//
		
//		Integer[] result = numbers.stream() // Stream<Integer>
//				   .filter(number -> number % 2 == 0)
//				   .distinct()
//				   .toArray(Integer[]::new);
		
		Set<Integer> result = numbers.stream() // Stream<Integer>
				   .filter(number -> number % 2 == 0)
				   .collect(Collectors.toSet());

//		Arrays.stream(result) // Stream<Integer>
//			  .forEach(System.out::println);
		result.forEach(System.out::println);
	}
}

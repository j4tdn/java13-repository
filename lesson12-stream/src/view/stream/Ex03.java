package view.stream;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 4, 1, 2, 3, 4);
		
		//find all even elements
//		Integer[] result = numbers.stream()
//			   .filter(number -> number % 2 == 0)
//			   .toArray(new IntFunction<Integer[]>() {
//
//				@Override
//				public Integer[] apply(int length) {
//					// TODO Auto-generated method stub
//					return new Integer[length];
//				}
//			   });
		
		Integer[] result = numbers.stream()
				   .filter(number -> number % 2 == 0)
				   .distinct()
				   .toArray(Integer[]::new);
		
		Arrays.stream(result) //Stream<Integer>
			.forEach(System.out::println);
		
	}
}

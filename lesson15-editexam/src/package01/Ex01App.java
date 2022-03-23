package package01;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex01App {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 2, 2, 2, 3, 4, 5 };
		// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		// Distinct: 1 2 3 4 5
		// Expected: 3 4 5
		
		Map<Integer, Long> nnumbersStatistic = Arrays.stream(numbers) // IntStream
			  .boxed() // Stream<Integer>
			  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Map<Integer, Long>
		
		System.out.println("Print out unique numbers");
		nnumbersStatistic.forEach((number, count) -> {
			if(count == 1) System.out.print(number + " ");
		});
		
		System.out.println("\n========================");
		
		// Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
		// Expected: 1 2 
		System.out.println("Print out numbers which appear more than 1 time");
		nnumbersStatistic.forEach((number, count) -> {
			if(count > 1) System.out.print(number + " ");
		});
	}
}

package view;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 
 * @author Pho Dac Biet
 *	Cho dãy N (0 <= N < 100) phần tử. Mỗi phần tử N[i] (1 <= N[i] <= 20) là
	một số nguyên
 */

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		// Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		
		// good thinking - nhưng code trùng lặp e có thể tạo 1 method ra để xử lý
		
		System.out.println("Number has appeared one : ");
		numbers.stream()
			   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			   .entrySet()
			   .stream()
			   .filter(entry -> entry.getValue() == 1)
			   .map(entry -> entry.getKey())
			   .collect(Collectors.toList())
			   .forEach(System.out::println);
		// Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
		System.out.println("Number has appeared one more: ");
		numbers.stream()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream()
			.filter(entry -> entry.getValue() > 1)
			.map(entry -> entry.getKey())
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
}

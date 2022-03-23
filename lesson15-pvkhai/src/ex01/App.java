package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		
		List<Integer> N1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		List<Integer> N2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 11);
		
		List<Integer> result1 = distinct(N1, entry -> entry.getValue() == 1);
		System.out.println("Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N1");
		for(int i: result1) {
			System.out.print(i + " " );
		}
		System.out.println("==========================");
		System.out.println("Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N2");
		List<Integer> result2 = distinct(N2, entry -> entry.getValue() > 1);
		for(int i: result2) {
			System.out.print(i + " " );
		}
		
	}
	
	// Hàm distinct1 và distinct2 chỉ khác nhau chỗ ==1 và >1. Đó là điều kiện
	// E có thể viết thành 1 hàm như thế này
	private static List<Integer> distinct(List<Integer> N, Predicate<Entry<Integer, Long>> predicate) {
		List<Integer> result = N.stream()
							.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(predicate)
							.map(entry -> entry.getKey())
							.collect(Collectors.toList());
		return result;
		
	}
	
}

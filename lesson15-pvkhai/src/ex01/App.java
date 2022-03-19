package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		
		List<Integer> N1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		List<Integer> N2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 11);
		
		List<Integer> result1 = distinct1(N1);
		System.out.println("Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N1");
		for(int i: result1) {
			System.out.print(i + " " );
		}
		System.out.println("==========================");
		System.out.println("Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N2");
		List<Integer> result2 = distinct2(N2);
		for(int i: result2) {
			System.out.print(i + " " );
		}
		
	}
	
	private static List<Integer> distinct1(List<Integer> N) {
		List<Integer> result = N.stream()
							.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(entry -> entry.getValue() == 1)
							.map(entry -> entry.getKey())
							.collect(Collectors.toList());
		return result;
		
	}
	private static List<Integer> distinct2(List<Integer> N) {
		List<Integer> result = N.stream()
							.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
							.entrySet()
							.stream()
							.filter(entry -> entry.getValue() > 1)
							.map(entry -> entry.getKey())
							.collect(Collectors.toList());
		return result;
		
	}
	
}

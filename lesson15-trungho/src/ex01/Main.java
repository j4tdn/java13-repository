package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> numberList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		
		System.out.println("Numbers display 1 time in the input list:");
		// good thinking
		// 2 đoạn code dài chỉ khác nhau chỗ entry -> entry.getValue() == 1 && > 1
		// a Trung có thể viết 1 method và truyền tham số vào
		List<Integer> resultList1 = numberList1.stream()
			   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			   .entrySet()
		       .stream()
		       .filter(entry -> entry.getValue() == 1)
		       .map(entry -> entry.getKey())
		       .collect(Collectors.toList());
		resultList1.forEach(System.out::println);
		
		System.out.println("------------------------------------------------");
		
		List<Integer> numberList2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 11);
		
		System.out.println("Numbers display more than 1 time in the input list:");
		List<Integer> resultList2 = numberList2.stream()
			   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			   .entrySet()
		       .stream()
		       .filter(entry -> entry.getValue() > 1)
		       .map(entry -> entry.getKey())
		       .collect(Collectors.toList());
		resultList2.forEach(System.out::println);
	}
}

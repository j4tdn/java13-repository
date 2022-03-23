package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class App {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,3,4,5);
		List<Integer> uniqueNumbers = numbers.stream()
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
											.entrySet()
											.stream()
											.filter(entry -> entry.getValue() == 1)
											.map(entry -> entry.getKey())
											.collect(Collectors.toList());
		
		System.out.println("Unique numbers: ");
		uniqueNumbers.forEach(number -> System.out.print(number + ", "));
		
		List<Integer> duplicateNumbers = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("Duplicate numbers: ");
		duplicateNumbers.forEach(number -> System.out.print(number + ", "));
	}
	
	// Anh Nguyên có thể cho sẵn một mảng dữ liệu và tập trung vào xử lý logic
	// Không cần nhập ở bước này
	public static List<Integer> inputData() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Input n: ");
			n = Integer.parseInt(sc.nextLine());
		} while(n < 1 || n > 20);
		
		List<Integer> numbers = new ArrayList<>(n);
		
		for(int i = 1; i <= n; i++) {
			numbers.add(Integer.parseInt(sc.nextLine()));
		}
		
		return numbers;
	}
}

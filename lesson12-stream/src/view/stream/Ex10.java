package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		// Flatmap -----> Array, List

		Integer[][] numbers = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };

		Integer[] rs = Arrays.stream(numbers) // Stream<Integer[]>
				.flatMap(Arrays::stream) // Stream<Integer>
				.toArray(Integer[]::new); // Integer[]

		Arrays.stream(rs).forEach(System.out::println);
		
		System.out.println("=============================");
		
		List<List<String>> cards = Arrays.asList(Arrays.asList("2 cơ", "3 rô", "4 chuồn"),
				Arrays.asList("2 rô", "3 cơ", "4 bích"), Arrays.asList("2 cơ", "3 bich", "4 cơ"));

		String remainingCards = cards.stream().flatMap(List::stream).collect(Collectors.joining(", "));
		
		System.out.println(remainingCards);
	}
}

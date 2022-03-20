package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		Integer[][] numbers = {
				{1, 4, 7},
				{2, 5, 8},
				{3, 6, 9}
		};
		Integer[] result = Arrays.stream(numbers)
				.flatMap(Arrays::stream) // owd -> Arrays.stream(owd)
				.toArray(Integer[]::new);
		Arrays.stream(result).forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 cơ", "3 rô", "4 bích"),
				Arrays.asList("2 chuồn", "3 cơ", "4 rô"),
				Arrays.asList("2 rô", "3 bích", "4 chuồn")
		);
		String remainingCards = cards.stream() // Stream<List<String>>
			 .flatMap(List::stream) // Stream<String>
			 .collect(Collectors.joining(", ")); // String
		System.out.println(remainingCards);
	}
}

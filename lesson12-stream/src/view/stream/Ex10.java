package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		Integer[][] numbers = {{1, 4, 7},
							  {2, 5, 8},
							  {3, 6, 9}};
		
		Integer[] result = Arrays.stream(numbers)
			  .flatMap(Arrays::stream)
			  .toArray(Integer[]::new);
		
		Arrays.stream(result).forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 co","3 co","4 co"),
				Arrays.asList("2 ro","3 ro","4 ro"),
				Arrays.asList("2 bich","3 bich","4 bich")
				);
				
		String remainingCards = cards.stream()
				.flatMap(card -> card.stream())
				.collect(Collectors.joining(", "));
		System.out.println(remainingCards);
	}
}

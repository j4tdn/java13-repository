package view.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		// FlatMap --> Array, List
		
		Integer[][] numbers = {
				{1, 4, 7}, 
				{2, 5, 9}, 
				{3, 6, 8}
		};
		
		Integer[] result = Arrays.stream(numbers) // Stream<Integer[]>
			  .flatMap(Arrays::stream)
			  .toArray(Integer[]::new);
		
		Arrays.stream(result).forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 cơ", "3 rô", "4 chuồn"),
				Arrays.asList("2 rô", "3 cơ", "4 bích"),
				Arrays.asList("2 chuồn", "3 bích", "4 rô")
		);
		
		List<String> cardResult = cards.stream() // Stream<List<String>>
			 .flatMap(Collection::stream) // Stream<String>
			 .collect(Collectors.toList()); // List<String>
		
//		String cardResult = cards.stream() // Stream<List<String>>
//				 .flatMap(card -> card.stream()) // Stream<String>
//				 .collect(Collectors.joinin	g(", ")); // List<String>
//		
//		System.out.println(cardResult);
		cardResult.forEach(System.out::println);
		
 	}
}

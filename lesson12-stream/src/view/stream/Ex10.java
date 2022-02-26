package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		//FlatMap --> Array, List
		Integer[][] numbers = {
				{1, 4, 7}, 
				{2, 5, 8}, 
				{3, 6, 9}
			};
		
		Integer[] result = Arrays.stream(numbers) // Stream<Integer[]>
			.flatMap(Arrays::stream)			  // Stream<Integer>
			.toArray(Integer[]::new);
			
		Arrays.stream(result).forEach(System.out::println);
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 cơ", "3 rô", "4 bích"),
				Arrays.asList("2 chuồn", "3 cơ", "4 rô"),
				Arrays.asList("2 bích", "3 chuồn", "4 cơ")
				);
		String c = cards.stream()						 // Stream<List<String>>
			.flatMap(card -> card.stream())  // Stream<String>
			.collect(Collectors.joining(", "));	 // String
		System.out.println(c);
	}
}	

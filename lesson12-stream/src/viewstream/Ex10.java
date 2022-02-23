package viewstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
	public static void main(String[] args) {
		Integer[][] number = { { 1, 2, 4 }, { 3, 5, 8 }, { 3, 2, 4 } };
		Integer[] result = Arrays.stream(number)  //Stream<Integer[]>
			  .flatMap(Arrays::stream) //Stream<Integer>
			  .toArray(Integer[]::new);//integer[]
		Arrays.stream(result).forEach(System.out::println);
		System.out.println("================");
		
		List<List<String>> cards = Arrays.asList(
				Arrays.asList("2 co","3 ro", "4 bich"),
				Arrays.asList("5 co","3 ro", "4 bich"),
				Arrays.asList("7 co","3 ro", "4 bich")
				);
		List<String> remainingCards = cards.stream()
			 .flatMap(Collection::stream)
			 .collect(Collectors.toList());
		remainingCards.forEach(System.out::println);
	}
}

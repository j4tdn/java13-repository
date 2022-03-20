package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		List<Integer> result = inventory.stream()  // Stream<Apple>
				 .filter(apple -> apple.getWeight() > 400) // Stream<Apple>
				 .map(Apple::getId) // Stream<Integer>
				 .collect(Collectors.toList()); // List<Integer>
		result.forEach(System.out::println);
	}
}

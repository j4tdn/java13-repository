package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

public class Ex02 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		List<Integer> result =  inventory.stream()
				 .filter(apple -> {
					 System.out.println("filter " + apple.getId());
					 return apple.getWeight() > 400;
				 }) // <Stream<Apple>
				 .map(apple -> {
					 System.out.println("map " + apple.getId());
					 return apple.getId();
				 })              // Stream<Integer
				 .collect(Collectors.toList());
		System.out.println("=================");
		result.forEach(System.out::println);
	}
}

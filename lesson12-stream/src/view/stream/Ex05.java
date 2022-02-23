package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05 {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();
		dishes.forEach(System.out::println);

		System.out.println("==========================");

		System.out.println("Unique dish's calories: ");
		List<Double> uniqueCalories = dishes.stream()
				.collect(Collectors.groupingBy(dish -> dish.getCalories(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).collect(Collectors.toList());

		uniqueCalories.forEach(System.out::println);
	}
}

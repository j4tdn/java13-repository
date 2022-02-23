package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05 {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();

		/* Unique Calories */
		/*
		 * System.out.println("Unique dish's calories: "); List<Double> uniqueCalories =
		 * dishes.stream().collect(Collectors.groupingBy(dish -> dish.getCalories(),
		 * Collectors.counting())).entrySet().stream() .filter(entry -> entry.getValue()
		 * == 1).map(entry -> entry.getKey()).collect(Collectors.toList());
		 * 
		 * uniqueCalories.forEach(System.out::println);
		 */

		/* Distinct by ID => Overriding equals and hashcode */

		List<Dish> resultList = dishes.stream().distinct().collect(Collectors.toList());
		resultList.forEach(System.out::println);
		
		System.out.println("==================================");
		
		Set<Dish> resultSet = dishes.stream().distinct().collect(Collectors.toSet());
		resultSet.forEach(System.out::println);
	}
}

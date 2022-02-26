package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.NameCaloriesParameter;
import model.DataModel;

public class Ex09 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		menu.stream()
			.map(dish -> new NameCaloriesParameter(dish.getName(), dish.getCalories()))
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
		
	}
}

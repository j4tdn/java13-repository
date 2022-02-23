package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.NameCaloriesParameter;
import model.DataModel;

public class Ex05 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		// new Dish("2", "D2", 620, Kind.OTHER, true) ==> (Name, Calories)
		
		List<NameCaloriesParameter> result = menu.stream()
			.map(dish -> new NameCaloriesParameter(dish.getName(), dish.getCalories()))
			.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}

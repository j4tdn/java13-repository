package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex08 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = menu.stream()
						  .filter(dish -> Dish.Kind.MEAT.equals(dish.getKind()))
						  .limit(2)
						  .collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}

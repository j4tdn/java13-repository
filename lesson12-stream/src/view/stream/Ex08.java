package view.stream;

import java.util.List;

import bean.Dish;
import bean.Dish.Kind;
import model.DataModel;

public class Ex08 {
	public static void main(String[] args) {
		List<Dish> dishes = DataModel.getDishes();

		dishes.stream()
		.filter(dish -> Kind.MEAT.equals(dish.getKind()))
		.limit(2)
		.forEach(System.out::println);

	}
}

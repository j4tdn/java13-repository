package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex04 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
				menu.stream()
					.filter(dish -> Dish.Kind.MEAT.equals(dish.getKind()))
					.limit(2)
					.forEach(System.out::println);
	}
}

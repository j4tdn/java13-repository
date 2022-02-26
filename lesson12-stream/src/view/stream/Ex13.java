package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

		if (menu.isEmpty()) {
			System.out.println("Menu length should be greater than 0!");
			return;
		}
		// Find the dish have highest calories
		Dish dish = menu.stream()
				.reduce(menu.get(0), (d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2);
		System.out.println("dish: " + dish);
	}
}

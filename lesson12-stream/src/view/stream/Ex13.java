package view.stream;

import java.util.List;
import java.util.Optional;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		// Find dish with maximum calories
		if(menu.isEmpty()) {
			System.out.println("Menu length should be grater than 0");
		}
		Dish bigdish = menu.stream()
			.reduce(menu.get(0),(d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2);
		System.out.println("Dish with maximum calories: " + bigdish);
	}
}

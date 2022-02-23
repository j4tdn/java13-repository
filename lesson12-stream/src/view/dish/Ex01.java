package view.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Dish;
import model.DataModel;

/**
 * Input:       List<Dish> menu
 * Requirement: Get dishes which have calories greater than 400
 *            : Generic for any condition, any class
 * Output:      List<Dish> result
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = filter(menu, dish -> dish.getCalories() > 400);
		result.forEach(System.out::println);
	}

	// manual
	private static List<Dish> filter(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish: menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}
}

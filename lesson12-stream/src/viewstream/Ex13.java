package viewstream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		if(menu.isEmpty()) {
			System.out.println("menu length should be greater than 0");
			return;
		}
		
		Dish dish =menu.stream()
			.reduce(menu.get(0),(initialDish,element)-> {
				if(initialDish.getCalories() < element.getCalories()) {
					return element;
				}
				return initialDish;
			});
		System.out.println("dish: "+dish);
		System.out.println("calories: "+dish.getCalories());
	}
}

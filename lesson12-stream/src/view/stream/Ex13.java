package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		if(menu.isEmpty()) {
			System.out.println("Menu size should be greater than 0");
			return;
		}
		
		// Find dish with maximum calories
		Dish dish = menu.stream()
						.reduce(menu.get(0), (initialMax, element) -> {
							return element.getCalories() > initialMax.getCalories() ? element : initialMax;
						});
			
		System.out.println("Dish: " + dish);
	}
}

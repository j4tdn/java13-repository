package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex13 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		//Find dish with maximum calories
		Dish dish = menu.stream()
			.reduce(menu.get(0), (d1, d2) -> {
				return d1.getCalories() > d2.getCalories() ? d1 : d2;
			});
		System.out.println("Dish max calori: " + dish);
		
	}
}

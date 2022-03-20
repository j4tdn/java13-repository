package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		// Dish id: 1 2 3 4 5 6 7
		List<Dish> resultList = menu.stream()
			.distinct()
			.collect(Collectors.toList());
		Set<Dish> resultSet = menu.stream()
				.distinct()
				.collect(Collectors.toSet());
		resultList.forEach(System.out::println);
		System.out.println("===================");
		resultSet.forEach(System.out::println);
	}
}

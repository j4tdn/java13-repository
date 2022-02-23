package view.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> resultList = menu.stream().distinct().collect(Collectors.toList());

		Set<Dish> resultSet = menu.stream().collect(Collectors.toSet());

		resultList.forEach(System.out::println);

		System.out.println("=========================");

		resultSet.forEach(System.out::println);

	}
}

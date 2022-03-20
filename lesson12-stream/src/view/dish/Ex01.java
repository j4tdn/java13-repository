package view.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

/**
 * Input: List<Dish> menu
 * Requirement: Get dishes which have calories greater than 400
 * 				Generic for any condition, any class
 * Output: List<Dish> result
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = filter(menu, dish -> dish.getCalories()>600);
		result.forEach(System.out::println);
		
		///////////////////////////////////
		System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
		// B1: Convert DÂT_SOURCE to Stream
		//   : List<Dish> --> Stream<Dish>
		// B2: Call method(API) from stream to handle requirements
		//   : methods which are written as Builder Pattern
		//   : Stream<X> stream = stream.method1().method2()
		List<String> streamResult = menu.stream()
		    .filter(dish -> dish.getCalories() > 800) // Stream<Dish>
		    .map(Dish::getName) // Stream<String>
		    .collect(Collectors.toList()); // List<String>
		streamResult.forEach(System.out::println);
		 
	}
	// manual, any class and condition
	private static <E> List<E> filter(List<E> menu, Predicate<E> predicate){
		List<E> result = new ArrayList<>();
		for (E e : menu) {
			if(predicate.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
}

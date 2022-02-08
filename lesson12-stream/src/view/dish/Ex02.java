package view.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

/**
 * Input:       List<Dish> menu
 * Requirement: Get dishes which have calories greater than 400
 *            : Generic for any condition, any class
 * Output:      List<Dish> result
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = filter(menu, dish -> dish.getCalories() > 600);
		result.forEach(System.out::println);
		
		///////////////////////////////////////////////////////
		System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\n");
		
		// B1: Convert DATA_SOURCE to Stream
		//   : List<Dish> --> Stream<Dish>
		// B2: Call methods(API) from stream to handle requirements
		//   : stream methods which are written as Builder Pattern
		//   : Item item = Item.builder().id().name().city();
		//   : Stream<X> stream = stream.methodA().methodB()
		// B3: Return List<Dish>
		List<String> streamResult = menu.stream() // Stream<Dish>
		    .filter(dish -> dish.getCalories() > 800) // Stream<Dish>
		    .map(Dish::getName) // Stream<String>
		    .collect(Collectors.toList()); // List<String>
		streamResult.forEach(System.out::println);
	}
	
	// manual, any class and condition
	private static <E> List<E> filter(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		for (E element: elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}
package view.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

/**
 *	Input: 			List<Dish> menu	 
 *	Requirement: 	Get dishes which have calories greater than 400
 *			   :	Generic for nay condition, any class
 *	Ouput: 			List<Dish> result 
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		List<Dish> result = filter(menu, dish -> dish.getCalories() > 400);
		result.forEach(System.out::println);
		
		///////////////////////////////////////////////////////////////
		System.out.println("//////////////////");
		
		// B1: Convert DATA_SOURCE to Stream
		//   : List<Dish> --> Stream<Dish>	
		// B2: Call methods(API) from stream to handle requirements
		//   : methods which are written as Builder Pattern
		//   : Item item = Item.builder().id().name().city();
		//   : Stream<X> stream = stream.methodA().methodB()
		List<String> streamResult = menu.stream() // Stream<Dish>
			.filter(dish -> dish.getCalories() < 400) // Stream<Dish>
			.map(Dish::getName) // Stream<String>
			.collect(Collectors.toList()); // List<String>
		streamResult.forEach(System.out::println);
	}
	
	// Manual 
	private static <E> List<E> filter(List<E> elements, Predicate<E> predicate) {
		List<E> result = new ArrayList<>();
		for (E element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}
		return result;
	}
}

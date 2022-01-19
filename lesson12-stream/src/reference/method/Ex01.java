package reference.method;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import model.DataModel;

/**
 * Input: List<Apple> inventory Write methods to 1. Get origin country of apples
 * in inventory
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		// Function<Apple, String> functionL = apple -> apple.getCountry();
		// Function<Apple, String> functionM = Apple::getCountry;
		
		// Fixed: C1 >> Method Reference >> Using definition methods
		// Opt1: Non-static method
		// 1. (Apple apple) -> apple.getCountry()
		// (T t) -> t.definedMethod() ===> T::definedMethod
		
		Set<String> countries = map(inventory, Apple::getCountry);
		countries.forEach(country -> System.out.println(country));
		
		// Opt2: Static method with a sorter way for lambda, method reference
		// Function<Apple, String> function = (Apple apple) -> apple.getCountry()
		// Input: Apple
		// Output: String
		// >>>>>>>>>>>> static String transfer(Apple)
		Set<String> countriesZ = map(inventory, Ex01::transfer);
		countriesZ.forEach(country -> System.out.println(country));
	}

	private static <E, R> Set<R> map(List<E> apples, Function<E, R> function) {
		Set<R> result = new HashSet<>();
		for (E apple : apples) {
			result.add(function.apply(apple));
		}

		return result;
	}
	
	private static String transfer(Apple apple) {
		return apple.getCountry();
	}
}

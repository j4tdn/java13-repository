package reference.method;

import bean.Apple;
import model.DataModel;
import utils.Printable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * Input: List<Apple> inventory Write methods to 1. Get origin
 * countries(List<String>) of apples(List<Apple>) in inventory
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();

		// Lambda
		Set<String> countriesX = map(inventory, apple -> apple.getCountry());
		Printable.print(countriesX);
		System.out.println("===================");

		// Function<Apple, String> functionL = apple -> apple.getCountry();
		// Function<Apple, String> functionM = Apple::getCountry;

		// Fixed: C1 >> Method Reference >> using definition methods
		// Option 1: Non-static method
		// VD: @@ (Apple apple) -> apple.getCountry() @@ ==>>> Apple::getCountry
		// (T t) -> t.definedMethod() ===>>> T::definedMethod

		Set<String> countriesY = map(inventory, Apple::getCountry);
		Printable.print(countriesY);
		System.out.println("===================");
		
		// Option 2: Static method 
		// Function<Apple, String> function = (Apple apple) -> apple.getCountry();
		// Input: Apple
		// Output: String
		// >>>>>>>>>>>>>> static String transfer(Apple)
		// @@ (Apple apple) -> apple.getCountry() @@ ==>>> OwnClass::transfer
		Set<String> countriesZ = map(inventory, Apple::transfer);
		Printable.print(countriesZ);
	}

	private static <E, R> Set<R> map(List<E> elements, Function<E, R> function) {
		Set<R> result = new HashSet<>();
		for (E element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	
	
}

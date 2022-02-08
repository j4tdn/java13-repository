package reference.method;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import Utils.Printable;
import bean.Apple;
import model.DataModel;

/*
 * +Input: List<Apple> inventory
 * Write method to 
 * 1. Get origin country of apples inventory
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.getApples();
		
		
		Function<Apple, String> function1 = apple->apple.getCountry();
		Function<Apple, String> function2 = Apple::getCountry;
		
		//fixed: C1 >> Method Reference >> using definition methods\
		
		//Opt1: Non-static method
		//VD: (Apple apple) -> apple.getCountry() = Apple::getCountry
		// (T t) -> t.defineMethod()  = T::defineMethod
	
		Set<String> countries1 = map(inventory, Apple::getCountry);
		Printable.print(countries1);
		
	
		
		//Opt2: static method
		// Input: Apple
		// Output: String
		// static String transfer(Apple)
		Set<String> countries2 = map(inventory, Ex01::transfer);
		Printable.print(countries2);
		
	}
	
	private static <E, R> Set<R> map(List<E> elements, Function<E, R> function){
		Set<R> result = new HashSet<>();
		for(E element: elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
	private static String transfer(Apple apple) {
		return apple.getCountry();
	}
}

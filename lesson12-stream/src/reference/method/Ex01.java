package reference.method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.AppleData;
import utils.Printable;

/**
 * Input: List<Apple> inventory
 * Write methods to
 * 1. Get origin countries of apples in inventory
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		// apple -> apple.getCountry();    >>>>   Apple:getCountry (Non-static method)
		List<String> countries = map(inventory, Apple::getCountry);
		Printable.printf(countries);
	}
	
	private static <E, R> List<R> map(List<E> elements, Function<E, R> function){
		List<R> result = new ArrayList<>();
		for (E element : elements) {
			R r = function.apply(element);
			if (result.contains(r)) {
				result.add(r);
			}
		}
		return result;
	}
}
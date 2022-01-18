package reference.method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import bean.Apple;
import model.AppleData;
import utils.Printable;

/**
 * Input: List<Apple> inventory Write methods to 1. Get origin countries of
 * apples in inventory
 * 
 * @author tranc
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleData.getAll();
		
		//Opt1: non-static method
		//List<String> countries = filter(inventory, apple->apple.getCountry());
		
		//(T t) -> t.definedMethod() ===> T::definedMethod
		//Method Reference
		List<String> countries1 = filter(inventory, Apple::getCountry);
		Printable.printALL(countries1);
		
		System.out.println("=========================================");
		
		List<String> countries2 = filter(inventory, Ex01::convert);
		Printable.printALL(countries2);
	}

	private static <E, R> List<R> filter(List<E> elements, Function<E, R> function) {
		List<R> result = new ArrayList<>();
		for (E element : elements) {
			R item = function.apply(element);
			if(!result.contains(item))
				result.add(item);
		}
		return result;
	}
	
	private static String convert(Apple apple) {
		return apple.getCountry();
	}
}

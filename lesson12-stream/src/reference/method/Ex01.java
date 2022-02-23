package reference.method;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import bean.Apple;
import model.AppleModel;
import utils.Printable;

public class Ex01 {
	public static void main(String[] args) {
		List<Apple> inventory = AppleModel.getAll();
		Set<String> countriesX = map(inventory, apple -> apple.getCountry());
		Printable.print(countriesX);
		System.out.println("==========");
		Set<String> countriesY = map(inventory, Apple::getCountry);
		Printable.print(countriesY);
		System.out.println("==========");
		Set<String> countriesZ = map(inventory, Apple::transfer);
		Printable.print(countriesZ);
		
	}
	
	private static <E,R> Set<R> map(List<E> elements, Function<E, R> function ){
		Set<R> result = new HashSet<>();
		for(E element:elements) {
			result.add(function.apply(element));
		}
		return result;
	}
	
}

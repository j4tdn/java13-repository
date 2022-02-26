package view.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex06 {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();

		List<Dish> result = menu.stream()
								.filter(distinctByKey(Dish::getKind))
								.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
	}
	
	/*
	 * <C> Class Type
	 * <P> Property Type
	 * 
	 */
	
	private static <C, P> Predicate<C> distinctByKey(Function<C, P> function){
		Set<P> set = new HashSet<>();
		return dish -> set.add(function.apply(dish));
	}
	
}

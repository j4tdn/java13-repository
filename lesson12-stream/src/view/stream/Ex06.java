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
		// 1 2 3 
		List<Dish> resultList = menu.stream()
			.filter(distinctByKey(Dish::getKind))
			.collect(Collectors.toList());
		
		resultList.forEach(System.out::println);
	}
	
	/**
	 * 
	 * @param <C> Class type
	 * @param <P> Property type
	 */
	private static <C, P> Predicate<C> distinctByKey(Function<C, P> function) {
		Set<P> set = new HashSet<>();
		return C -> set.add(function.apply(C));
	}
}

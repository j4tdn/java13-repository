package view.stream;
/**
 * Distinct based on the predicate parameter
 */
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
		List<Dish> dishes = DataModel.getDishes();

		List<Dish> rs = dishes.stream().filter(distinctByKey(Dish::getKind)).collect(Collectors.toList());
		rs.forEach(System.out::println);
		
	}

	private static <C, P> Predicate<C> distinctByKey(Function<C, P> function) {
		Set<P> set = new HashSet<>();
		return d -> set.add(function.apply(d));
	}
}

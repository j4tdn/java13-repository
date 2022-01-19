package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

/**
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 * + Supplier<R>          ==> R get()
 * + Function<T, R>       ==> R get(T t)
 * + ????????<T, X, R>    ==> R get(T, X)
 * + ????????<T, X, K, R> ==> R get(T, X, K)
 * + ????????<T, X, K, U, R> ==> R get(T, X, K, U)
 */
public class Ex04 {
	public static void main(String[] args) {
		// Type inference
		// support to create instance of Apple with "no parameter"
		// Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
		
		// Function<Integer, Apple> ftn02 = id -> new Apple(id);
		Function<Integer, Apple> ftn02 = Apple::new;
		Apple apl02 = ftn02.apply(123);
		System.out.println(apl02);
		
		// BiFunction<Integer, String, Apple> bfn03 = (id, country) -> new Apple(id, country);
		BiFunction<Integer, String, Apple> bfn03 = Apple::new;
		Apple apl03 = bfn03.apply(234, "Vietnam");
		System.out.println(apl03);
		
		// QuFunction<Integer, String, Double, String, Apple> qun04 = (id, color, weight, country) -> new Apple(id, color, weight, country);
		QuFunction<Integer, String, Double, String, Apple> qun04 = Apple::new;
		Apple apl04 = qun04.apply(147, "Yellow", 258d, "Vietnam");
		System.out.println(apl04);
	}
}

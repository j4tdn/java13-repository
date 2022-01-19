package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

/**
 * 
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 *  + Supplier<R> 		==> R get()
 *  + Function<T, R> 	==> R get(T t)
 *  + BiFunction<T, X, R> ==> R get(T t, X x)
 *
 */
public class Ex04 {
	
	public static void main(String[] args) {
		// Type inference
		// Support to create instance of Apple with "no parameter"
		// Supplier<Apple> supplier01 = () -> new Apple();
		Supplier<Apple> supplier01 = Apple::new;
		Apple apl01 = supplier01.get();
		System.out.println(apl01);
		
		// Function<Integer, Apple> function02 = id -> new Apple(id);
		Function<Integer, Apple> function02 = Apple::new;
		Apple apl02 = function02.apply(123);
		System.out.println(apl02);
		
		// BiFunction<Integer, String, Apple> biFunction = (id, country) -> new Apple(id, country);
		BiFunction<Integer, String, Apple> biFunction = Apple::new;
		Apple apl03 = biFunction.apply(234, "Viet Nam");
		System.out.println(apl03);
		
		// QuFunction<Integer, String, Double, String, Apple> qFunction = (id, color, weight, country) -> new Apple(id, color, weight, country);
		QuFunction<Integer, String, Double, String, Apple> qFunction = Apple::new;
		Apple apl04 = qFunction.apply(147, "Yellow", 258d, "Viet Nam");
		System.out.println(apl04);
	}
}

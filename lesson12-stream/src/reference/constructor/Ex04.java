package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

/**
 * Short hand way to create instance if FI return Object Using ClassName::new +)
 * Supplier
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		// Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);

		Function<Integer, Apple> ftn02 = Apple::new;
		Apple apl02 = ftn02.apply(123);
		System.out.println(apl02);

		BiFunction<Integer, String, Apple> bfn03 = Apple::new;
		Apple apl03 = bfn03.apply(1, "green");
		System.out.println(apl03);
		
		QuFunction<Integer, String, Double, String, Apple> qfn04 = Apple::new;
		Apple apl04 = qfn04.apply(2, "red", 3.4, "Vietnam");
		System.out.println(apl04);
	}
}

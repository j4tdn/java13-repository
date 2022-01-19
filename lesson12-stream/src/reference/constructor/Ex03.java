package reference.constructor;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

/**
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 * + Supplier<R> ==> R get()
 * + Function<T, R> ==> R get(T t)
 */
public class Ex03 {
	public static void main(String[] args) {
		// support to create instance of Apple with "no parameter"
		// Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
		
		Function<Integer, Apple> ftn02 = (Integer id) -> {
			return new Apple(id);
		};
		Apple apl02 = ftn02.apply(123);
		System.out.println(apl02);
	}
}

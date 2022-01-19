package reference.constructor;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

/**
 * 
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 *  + Supplier<R> ==> R get()
 *  + Function<T, R> ==> R get(T t)
 *
 */
public class Ex03 {
	
	public static void main(String[] args) {
		// Support to create instance of Apple with "no parameter"
		// Supplier<Apple> supplier01 = () -> new Apple();
		Supplier<Apple> supplier01 = Apple::new;
		Apple apl01 = supplier01.get();
		System.out.println(apl01);
		
		Function<Integer, Apple> function02 = id -> new Apple(id);
		
		Apple apl02 = function02.apply(123);
		System.out.println(apl02);
	}
}

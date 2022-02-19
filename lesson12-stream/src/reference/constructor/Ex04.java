package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

/**
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 * + Supplier<T> ==> T get()
 * + Function<T, R> ==> R get(T t)
 */
public class Ex04 {
	public static void main(String[] args) {
		//support to create instance of Apple with "no parameter"
		//Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
		
		//Function<Integer, Apple> ftn02 = id -> new Apple(id);
		Function<Integer, Apple> ftn02 = Apple::new;
		Apple apl02 = ftn02.apply(123);
		System.out.println(apl02);
		
		//BiFunction<Integer, String, Apple> bfn03 = (id, country) -> new Apple(id, country);
		BiFunction<Integer, String, Apple> bfn03 = Apple::new;
		// Quadra kill
		
		Apple apl03 = bfn03.apply(234, "VietNam");
		System.out.println(apl03);
		
		//QuFunction<Integer, String, Double, String, Apple> qun04 = (id, color, weight, country) -> new Apple(id, country, weight, country);
		QuFunction<Integer, String, Double, String, Apple> qun04 = Apple::new;	
		Apple apl04 = qun04.apply(147, "yellow", 258d, "A");
		System.out.println(apl04);
	}
}

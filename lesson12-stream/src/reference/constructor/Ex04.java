package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

// Supplier<R> ==> R get()
// ClassAbc<T, R> ==> R get(T t)

public class Ex04 {
	public static void main(String[] args) {
		// Type inference
		// support to create instance of Apple with no parameter
		// Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
		
		// Function<Integer, Apple> ftn02 = id -> new Apple(id);
		Function<Integer, Apple> ftn02 = Apple::new;
		Apple apl02 = ftn02.apply(123);
		System.out.println(apl02);
		
		// BiFunction<Integer, String, Apple> bfn03 = (Integer id, String country) -> new Apple (id, country);
		BiFunction<Integer, String, Apple> bfn03 = Apple::new;
		Apple apl03 = bfn03.apply(234, "Viet Nam");
		System.out.println(apl03);
		
		// QuFunction<Integer, String, Double, String, Apple> qun04 = (Integer id, String color, Double weight, String country) -> new Apple(id, color, weight, country);
		QuFunction<Integer, String, Double, String, Apple> qun04 = Apple::new;
		Apple apl04 = qun04.apple(147, "Yello", 258d, "VietNam");
		System.out.println(apl04);
	}
}

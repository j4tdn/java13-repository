package reference.constructor;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

/*
 * Shorthand way to create instance of FI return Object
 * Using ClassName::new
 * + Supplier<R> => R get()
 * + Function<T, R> => R get(T t)
 */
public class Ex02 {
	public static void main(String[] args) {
		
		//support to create instance of Apple with "no parameter"
		//Supplier<Apple>  spl01 = () -> new Apple();
		Supplier<Apple>  spl01 = Apple::new;
		
		Apple apple1 = spl01.get();
		System.out.println(apple1);
		
		Function<Integer, Apple> fcn02 = id -> new Apple(id);
		
		Apple apple2 = fcn02.apply(123);
		System.out.println(apple2);
	}
}

package reference.constructor;

import java.util.function.Supplier;

import bean.Apple;

/*
 * Shorthand way to create instance of FI return Object
 * Using ClassName::new
 * + Supplier<T> => T get()
 */
public class Ex01 {
	public static void main(String[] args) {
		
		//support to create instance of Apple with no parameter
		Supplier<Apple>  spl01 = new Supplier<>() {

			@Override
			public Apple get() {
				return new Apple();
			}
		}; 
		
		Apple apple1 = spl01.get();
		
		
	}
}

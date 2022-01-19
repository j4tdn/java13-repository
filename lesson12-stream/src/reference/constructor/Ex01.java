package reference.constructor;

import java.util.function.Supplier;

import bean.Apple;

/**
 * 
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 *  + Supplier<T> ==> T get()
 *
 */
public class Ex01 {
	
	public static void main(String[] args) {
		// Support to create instance of Apple with no parameter
		Supplier<Apple> supplier01 = new Supplier<>() {
			@Override
			public Apple get() {
				return new Apple();
			}
		};
		
		Apple apl01 = supplier01.get();
		System.out.println(apl01);
	}
}

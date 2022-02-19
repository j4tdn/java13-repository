package reference.constructor;

import java.util.function.Supplier;

import bean.Apple;

/**
 * Shorthand way to create instance if FI return Object
 * Using ClassName::new
 * + Supplier<T> ==> T get()
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		Supplier<Apple> spl01 = new Supplier<>() {
			public Apple get() {
				return new Apple();
			};
		};
		
		Apple apl01 = spl01.get();
		System.out.println(apl01);
	}
}

package reference.constructor;

import java.util.function.Supplier;

import bean.Apple;

/**
 * Short hand way to create instance if FI return Object
 * Using ClassName::new
 * +) Supplier
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		//Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		
		Apple apl01 = spl01.get();
		System.out.println(apl01);
	}
}

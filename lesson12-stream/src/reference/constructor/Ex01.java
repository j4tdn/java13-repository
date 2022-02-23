package reference.constructor;

import java.util.function.Supplier;

import bean.Apple;

public class Ex01 {
	public static void main(String[] args) {
		Supplier<Apple> spl01 = new Supplier<Apple>() {

			@Override
			public Apple get() {
				
				return new Apple();
			}
		};
		 Apple apl01 = spl01.get();
		 System.out.println(apl01);
	}
}

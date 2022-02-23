package reference.constructor;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Ex03 {
	public static void main(String[] args) {
		Supplier<Apple> spl01 = Apple::new;
		 Apple apl01 = spl01.get();
		 System.out.println(apl01);
		 
		 Function<Integer, Apple> ftn02 = Apple::new;
		 
		 Apple apl02 = ftn02.apply(123);
		 System.out.println(apl02);
	}
	
	
}

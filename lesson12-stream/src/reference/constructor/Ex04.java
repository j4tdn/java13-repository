package reference.constructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Ex04 {
	public static void main(String[] args) {
		Supplier<Apple> spl01 = Apple::new;
		 Apple apl01 = spl01.get();
		 System.out.println(apl01);
		 
		 Function<Integer, Apple> ftn02 = (id) -> new Apple(id);
		 Apple apl02 = ftn02.apply(123);
		 System.out.println(apl02);
		 
//		 BiFunction<Integer, String, Apple> bfn03 = (id,country) -> new Apple(id,country);
		 BiFunction<Integer, String, Apple> bfn03  = Apple::new ;
		 Apple apl03 = bfn03.apply(123,"VietNam");
		 System.out.println(apl03);
	}
	
	
}

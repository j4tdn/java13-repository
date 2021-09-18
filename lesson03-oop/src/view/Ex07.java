package view;

public class Ex07 {
	public static void main(String[] args) {
		int a = 5; // primitive
		Integer b = 10; // object
		Integer c = null; // object
		
		// assign object to primitive >> unboxing
		a = b;
		a = c;
		
		// primitive object to assign >> boxing
		b = a;
		c = a;
		
		// Casting : ép kiểu
		// Boxing  : primitive to object
		// Unboxing: object to primitive
		
		// FROM Java 1.5
		// AutoBoxing
		// AutoUnboxing
		
	}
}

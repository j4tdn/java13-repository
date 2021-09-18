package view;

public class Ex07 {
	public static void main(String[] args) {
		int a = 5; // primitive
		Integer b = 10; // object
		Integer c = 11; // object
		
		// assign object to primitive >> unboxing
		a = b;
		a = c; // check null
		
		// assign primitive to object >> boxing
		b = a;
		c = a;
		
		// Casting
		// Boxing   : primitive to object
		// Unboxing : object to primitive
		
		// FROM Java 1.5
		// AutoBoxing
		// AutoUnBoxing
		
	}
}

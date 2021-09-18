package view;

public class Ex07 {
	public static void main(String[] args) {
		int a = 5; // primitive
		Integer b = 10; // object
		Integer c = 11;  // object
		
		//assign object to primitive >> UnBoxing
		a = b;
		a = c;  // check null
		
		// assign primitive to object >> Boxing
		b = a;
		c = a;
		
		// Casting
		// Boxing : primitive to object
		// UnBoxing : object to primitive
		
		// FROM Java 1.5
		// AutoBoxing
		// AutoUnBoxing
	
	}

}

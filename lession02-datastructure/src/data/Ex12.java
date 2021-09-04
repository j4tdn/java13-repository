package data;

import bean.Digit;

public class Ex12 {
	
	public static void main(String[] args) {
		// primitive, object type
		// explain '=' operator
		int a = 5; // stack
		a = 10;
		int b = 12;
		a  = b; // copy value at stack
		
		String s = "Welcome"; // H1 b:H1(stack) H1(Welcome)Heap
		s = "Say Hello";
		String s1 = "bye";
		s = s1; // copy value at stack
		
		Digit d = new Digit(20); // H2
		d.value = 22; // H2 set value at heap (except)
		Digit d1 = new Digit(44); // H3
		d = d1; // d(H3) && d1(H3)
		
		// explain final => cannot re-assign value at stack
		// cannot use '=' operator again
		// convention: restrict unused, rubbish memory in JVM
		final int z1 = 10;
		
		final Integer i1 = 10;
		Integer i2 = 20;

		final Digit d2 = new Digit(7);
		Digit d3 = new Digit(11);

		
		// BUT COULD ASSIGN VALUE AT HEAP AS USUAL
		d2.value = d3.value; // HEAP
		
		// Constant pool -> java available type >> Integer, String, Long, Double
		// Example : Integer = 5, String = 'Hello'
	}
}

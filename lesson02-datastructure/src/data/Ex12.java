package data;

import bean.Digit;

public class Ex12 {
	public static void main (String[] args) {
		// primitive, Object type
		// explain '=' operator
		int a = 5; //stack
		a = 10;
		int b = 12;
		a = b; // copy value at stack
		
		String s = "Welcome"; //H1 b:H1(stack) H1(Welcome)Heap
		s = "say hello";
		String s1 = "bye";
		s = s1; // copy value at stack
		
		Digit d = new Digit(20); //H2
		d.value = 22; // H2 set value at heap (except)
		Digit d1 = new Digit(44); // H3
		d = d1; // d1(H3) d1(h3) copy value at stack
		
		// explain final => cannot re-assign value at STACK
		// cannot use '=' operator again
		// convention: restrict unused, rubbish memory in JVM
		final int z1 = 10;
		z1 = 100; //stack
		
		final Integer i1 = 10;
		Integer i2 = 20;
		i1 = 100; //stack
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit (101);
		d2 = d3; // stack
		
		// But could assign value at HEAP as usual
		d2.value = 8080;
		
		// constant pool -> JAVA available type >> Integer, String, Long, Double
		// Required: Integer a = 5; (constant pool), Integer a = new integer(5); // normal heap
	}
}

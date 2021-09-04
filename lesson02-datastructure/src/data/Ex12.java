package data;

import bean.Digit;

public class Ex12 {
	public static void main(String[] args) {
		// primitive, object types
		// explain '=' operator
		int a = 5;
		a=  10;
		int b =12;
		a= b; //copy value at stack
		
		String s= "welcome"; //H1 b:H1(Stack) H1(welcome)Heap
		s = "say hello";
		String s1 = "bye";
		s = s1; //copy value at stack
		
		Digit d = new Digit(20); //H2
		d.value = 22; //H2 set value at heap(except)
		Digit d1 = new Digit(44); //H3
		d = d1; //d1(H3) d(H3) copy value at stack
		
		
		//explain final => cannot reassign value at stack
		//cannot use '=' operator again
		//convention: restricted unused, rubbish memory in JVM
		
		final int z1= 10;
		//z1 = 100;//stack
		
		
		final Integer i1= 10;
		Integer i2 = 20;
		//i1 = i2;//stack
		
		
		final Digit d2 = new Digit(10);
		Digit d3 = new Digit(99);
		//d2 = d3; //stack
		//BUT could assign value at HEAP
		d2.value = d3.value; //heap
		
		
		// CONSTANT POOL => JAVA available type : Integer, String, Long, Double
		// Integer a = 5; (Constant Pool)
		// Integer a = new Integer(5); (Normal heap)
		
		
	}
}

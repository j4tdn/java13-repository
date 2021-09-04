package data;

import bean.Digit;

public class Ex12 {
	public static void main(String[] args) {
		//primitive, = type
		//explain ' = ' operator
		int a = 5;
		a = 10;
		int b = 12;
		a = b ;
		
		String s = "Welcome";// H1 s:H1(stack) H1(welcome)Heap
		s = "say hello";
		Digit d = new Digit(20);//H2
		d.value = 22;//H2 set value at HEAP
		Digit d1 = new Digit(44);//H3
		d = d1;
		
		//explain final => cannot re-assign value at stack
		int z1 = 10;
		z1 = 100;
		
		Integer i1 = 10;
		Integer i2 = 20;
		i1 = i2;
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit(101);
		
		
		d2.value = 2021;
		
		
		
	}
	
}

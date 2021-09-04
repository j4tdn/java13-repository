package data;

import bean.Digit;

public class Ex12 {
	
	public static void main(String[] args) {
		//primitive , object type
		//explain '=' operator
		int a = 5; //stack
		a = 10;
		int b = 12;
		a = b;
		
		String s ="welcome";
		s = "say hello";
		String s1 = "bye";
		s = s1;
		Digit d = new Digit(20); //h2
		d.value = 22; // h2 set value at heap
		Digit d1 = new Digit(4); //h3
		d = d1; //d1(h3) copy value at stack
		//exlain final --> cannot re-asign value at Stack
		//cannot use '=' operator again
		//convention
		final int z1 = 10;
//		z1 = 100; //Stack
		
		final Integer i1 = 10;
		Integer i2 = 20;
//		i1 = i2;
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit(100);
//		d2 = d3; //Stack
		d2.value = 300;
	}
	
}

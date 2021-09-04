package data;

import bean.Digit;

public class Ex12 {
	public static void main(String[] args) {
	    
		int a = 5;
		a = 10;
		int b = 12;
		a = b;
		
		String s = "welcome";
		s = "say hello";
		String s1 = "bye";
		s = s1;
		
		Digit d = new Digit(20);
		d.value = 22;
		Digit d1 = new Digit(44);
		d = d1;
		
		final int z1 = 10;
		// z1 = 100;
		
		final Integer i1 = 10;
		// i1 = 100;
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit(101);
		// d2 = d2;
		
		d2.value = 8080;
	}
}

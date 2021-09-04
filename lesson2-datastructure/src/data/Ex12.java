package data;

import bean.Digit;

public class Ex12 {
	
	public static void main(String[] args) {
		int a = 5; 		
		a = 10;
		int b = 12;
		a = b; 
		
		String s = "ahihihihi";
		s = "ahehe";
		String s1 = "hihia";
		s = s1; 
		
		Digit d = new Digit(20); // H2
		d.value = 22; 
		Digit d1 = new Digit(44); // H3
		d = d1; 
		
		final int z1 = 10;
		
		final Integer i1 = 10;
		Integer i2 = 20;
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit(101);
		
		d2.value = 8080;
		
	}
	
}

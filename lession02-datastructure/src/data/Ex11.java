package data;

import bean.Digit;

public class Ex11 {
	
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		swap(a, b);
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		Digit d1 = new Digit(15);
		Digit d2 = new Digit(25);
		
		System.out.println("d1: " + d1.value);
		System.out.println("d2: " + d2.value);
		
		swap(d1, d2);
		
		System.out.println("d1: " + d1.value);
		System.out.println("d2: " + d2.value);
		
	}
	
	// swap by create our Object
	private static void swap(Digit d1, Digit d2) {
		int tmp = d1.value;
		d1.value = d2.value;
		d2.value = tmp;
	}
	
	// no swap with primitive type
	// no swap with object Integer type
	private static void swap(Integer a , Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
	}
}

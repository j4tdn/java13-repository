package data;

import bean.Digit;

public class Ex10 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a1: " + a);
		modifi(a);
		System.out.println("a2: " + a);
		
		Integer b = 20;
		System.out.println("b1: " + b);
		update(b);
		System.out.println("b2: " + b);
		
		Digit d = new Digit (30);
		System.out.println("d1: "+ d);
		change(d);
		System.out.println("d2: "+ d);
	}
	private static void change(Digit f) {
		f.value = 77;
		f.value = 50;
		
	}
	//Integer input = b; >> operator = >> STACK 100%
	private static void update(Integer input) {
		input = 88;
	}
	private static void modifi(int input) {
		input = 99;
	}
	
}

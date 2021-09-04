package data;

import bean.Digit;

public class Ex10 {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a1: " + a);
		modify(a);
		System.out.println("a2: " + a);
		
		Integer b = 20;
		System.out.println("b1: " + b);
		update(b);
		System.out.println("b2: " + b);
		
		Digit d = new Digit(30);
		System.out.println("d1: " + d.value);
		System.out.println("value1: " + System.identityHashCode(d));
		change(d);
		System.out.println("d2: " + d.value);
	}
	
	private static void change(Digit input) {
		input.value = 77;
		System.out.println("value1: " + System.identityHashCode(input));
		input = new Digit(66);
		System.out.println("value2: " + System.identityHashCode(input));
		input.value = 55;
	}
	
	private static void update(Integer input) {
		input = 88;
	}
	
	private static void modify(int input) {
		input = 99;
	}
}

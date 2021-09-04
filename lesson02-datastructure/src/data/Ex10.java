package data;

import bean.Digit;

public class Ex10 {
	public static void main(String[] args) {
		int d = 10;
		System.out.println("d: " + d + "\t" + System.identityHashCode(d));
		update(d);
		System.out.println("d': " + d + "\t" + System.identityHashCode(d));
		
		System.out.println("=====================================");
		Integer d1 = 10;
		System.out.println("d1: " + d1 + "\t" + System.identityHashCode(d1));
		modify(d1);
		System.out.println("d1': " + d1 + "\t" + System.identityHashCode(d1));
		
		System.out.println("=====================================");
		Digit digit = new Digit(30);
		System.out.println("digit: " + digit.value + "\t" + System.identityHashCode(digit));
		change(digit);
		
	}

	private static void change(Digit digit) {
		digit.value = 77;
		System.out.println("digit: " + digit.value + "\t" + System.identityHashCode(digit));
		digit = new Digit(66);
		digit.value = 55;
		System.out.println("digit: " + digit.value + "\t" + System.identityHashCode(digit));
	}
	private static void update(Integer input) {
		input = 88;
	}
	private static void modify(int input) {
		input = 99;
	}
}

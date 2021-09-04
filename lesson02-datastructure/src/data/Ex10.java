package data;

import bean.Digit;

public class Ex10 {
	public static void main (String[] args) {
		int a = 10;
		System.out.println("a1: " + a);
		modify(a);
		System.out.println("a2: " + a);
		
		Integer b = 20;
		System.out.println("b1: " + b); //20
		update(b);
		System.out.println("b2: " + b); //20
		
		Digit d = new Digit(30);
		System.out.println("d1: " + d); //30
		System.out.println("d1: " + System.identityHashCode(d));
		change(d);
		System.out.println("d2: " + d); //77
	}
	
	// Digit digit = d;
	// pass by value at stack memory
	private static void change(Digit digit) {
		digit.value = 77;
		System.out.println("dg1: " + System.identityHashCode(digit));
		digit = new Digit(66);
		digit.value = 55;
		System.out.println("dg2: " + System.identityHashCode(digit));
		}
	
	private static void update(Integer input) {
		input = 88;
		}
	
	// pass by value
	private static void modify(int input) {
		input = 99;
		}
	}

package view;

import bean.Calculator;

public class Ex06 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(5, 5);
		
		System.out.println("sum1: " + c1.sum());
	}
//	private static int sum(int a, int b) { 
//		return a + b;
//	}
}

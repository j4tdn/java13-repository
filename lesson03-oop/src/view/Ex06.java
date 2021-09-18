package view;

import bean.Calculator;

public class Ex06 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(5, 5);
		System.out.println("sum1: " + c1.sum());
		
		//static
		//+ scope...
		// + loading time
		// .static: loading, starting project
		// .non static: while creating an object
		//timing: static loaded before non-static
	}
}

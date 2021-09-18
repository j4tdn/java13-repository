package view;

import bean.Calculator;

public class Ex06 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(5,10);
		System.out.println("sum: "+ c1.sum());
		
		//static
		// scope
		// static: loading, starting project
		// non static: while creating object
		// timing  static is loaded before non-static
		
		//static method >> use static
		// non-static >> use static , non-static attribute
	}
}

package view;

import bean.Calculator;

public class Ex06 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator(3, 4);
		System.out.println(c1.sum());
		
		// static
		// + scope
		// + loading time
		// .static: loading, starting project
		// .non-static: while creating an object
		// timing: static is loaded before non-static
		
		// non-static method >> use static, non-static attributes, method
		//     static method >> use static attributes, method
	}
}

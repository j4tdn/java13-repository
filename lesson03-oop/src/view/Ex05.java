package view;

import bean.Calculator;
import utils.CalculatorUtils;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//static sum
		int x = 5, y = 6;
		//Calculator.sum(x, y);
		
		//non-static sum
		Calculator cal = new Calculator(x, y);
		cal.sum();
		
		//Utility
		System.out.println("sum: " + CalculatorUtils.sum(5, 10));
		
		//non-static method >> use static; non-static attribute, method
		//static method >> use static attribute, method
	}
	
}

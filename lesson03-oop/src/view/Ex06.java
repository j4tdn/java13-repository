package view;

import bean.Calculator;

public class Ex06 {
	public static void main(String[] args) {
		Calculator c = new Calculator(4, 5);
		System.out.println("4+5=" + c.sum());
	}
}

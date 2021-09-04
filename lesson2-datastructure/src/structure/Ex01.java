package structure;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// if
		boolean expression = true;
		if (expression) {
			System.out.println("statement");
		}
		System.out.println("======================");
	
		if (expression) {
			System.out.println("statement1");
		} else {
			System.out.println("statement2");
		}
		
		boolean expression1 = true;
		if (expression) {
			if (expression1) {
				System.out.println("if in if");
			}
		}
		if (expression && expression1) {
			System.out.println("if in if");
		}
		int weekday = 4; 
		if (weekday == 2) {
			System.out.println("Monday");
		} else if (weekday == 3) {
			System.out.println("Tuesday");
		} else if (weekday == 4) {
			System.out.println("Wednesday");
		} else if (weekday == 5) {
			System.out.println("Thursday");
		} else if (weekday == 6) {
			System.out.println("Friday");
		} else if (weekday == 7) {
			System.out.println("Saturday");
		} else if (weekday == 8) {
			System.out.println("Sunday");
		} else {
			System.out.println("Wrong weekday !!!!");
		}
		
		System.out.println("exit");
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = ip.nextInt();
		
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}
	}
}

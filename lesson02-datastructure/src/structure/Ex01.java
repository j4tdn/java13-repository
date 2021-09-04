package structure;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// if
				boolean expression = false;
				if (expression) {
					// statement
					System.out.println("statement");
				}
				
				System.out.println("===========");
				
				// if else
				
				if (expression) {
					System.out.println("statement1");
				} else {
					System.out.println("statement2");
				}
				
				// if if if 
				boolean expression1 = true;
				if (expression) {
					if (expression1) {
						System.out.println("if in if");
					}
				}
				
				// Operator &&
				if (expression && expression1) {
						System.out.println("if in if");
						
				// if - else if - else if ... - else
				int weekday = 4; // Monday[2] - Sunday[8]
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
					System.out.println("Wrong weekday !!!");
				}
				
				System.out.println("exit");
				
				
				// Number is ODD or EVEN
				Scanner ip = new Scanner(System.in);
				System.out.print("Enter a number");
				int number = ip.nextInt();
				
				if (number % 2 == 0) {
					System.out.println(number + " is even number");
				} else {
					System.out.println(number + " is odd number");
				}
	}

}
}

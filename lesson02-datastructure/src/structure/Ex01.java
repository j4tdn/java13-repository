package structure;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
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
			System.out.println("Wrong weekday !!!!");
		}
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = ip.nextInt();
		
		if(number % 2 == 0){
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}
	}
}

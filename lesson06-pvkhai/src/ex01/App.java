package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = 0;
		float b = 0;
		while(true) {
			try {
				System.out.println("Enter a: ");
				a = Float.parseFloat(sc.nextLine());
				if(a == 0) {
					System.out.println("Fail Enter a # 0");
					throw new ArithmeticException();
				}
				System.out.println("Enter b: ");
				b = Float.parseFloat(sc.nextLine());
				
				break;
				
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Enter again!!!");
			}
		}
		
		float x = -b/a;
		System.out.println("result: " + x);
	}
}

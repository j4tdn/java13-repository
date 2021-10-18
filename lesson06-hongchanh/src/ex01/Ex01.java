package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		do {
			
			double a = nhap("a");
			double b = nhap("b");
			
			try {
				
				System.out.println(a + "x + " + b + " = 0 => x = " + -(test(a, b)));
				break;
				
			} catch (ArithmeticException e) {
				
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static double test(double a, double b) {
		if (b == 0d) {
			throw new ArithmeticException("nhap b khac 0!!!");
		}
		return b / a;
	}

	public static double nhap(String n) {
		Scanner sc = new Scanner(System.in);
		
		double d = 0d;
		
		do {
			try {
				
				System.out.print("nhap " + n + ": ");
				d = Double.parseDouble(sc.nextLine());
				break;
				
			} catch (Exception ex) {
				System.out.println("hay nhap so!");
			}
		} while (true);

		return d;

	}

}

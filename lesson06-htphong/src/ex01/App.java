package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;


/*
 * Giải phương trình bậc nhất ax + b = 0
 */


public class App {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Giai phuong trinh ax + b = 0");
		int i = 1;
		double a=0, b=0 ;
		DecimalFormat df = new DecimalFormat("#.##");
		do {
			try {
				System.out.println("Enter a: ");
				a = ip.nextDouble();
				System.out.println("Enter b: ");
				b = ip.nextDouble();
				
				if(equation(a, b)) {
					System.out.println("x = " + df.format(-b/a));
				}
			} catch (NumberFormatException e) {
				System.out.println("a or b is a number");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if(equation(a, b)) {
						break;
					}
				} catch (ArithmeticException e2) {
					System.out.print("");
				}
				System.out.print("Enter again (1 for 'yes', 0 for 'no'): ");
				i=ip.nextInt();
			}
			
		} while (i==1);
		
		
	}
	
	private static boolean equation(double a, double b) {
		if(a==0) {
			throw new ArithmeticException("a cannot be zero!");
		}
		return true;
	}
	
}

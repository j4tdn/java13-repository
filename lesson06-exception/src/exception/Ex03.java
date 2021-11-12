package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * 
 * Opt3 : check condition and throw exception before calling function
 */
public class Ex03 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {
			System.out.println(devide(a, b));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("message: " + ex.getMessage());
		}
		
		System.out.println("Back to main method");
	}
	
	public static int devide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("/ by zero");
		}
		return a / b;
	}
}

package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        
        double root;
        
        Integer a = enterNumber("a");
        boolean validateA = false;
        
        while (!validateA) {
            try {
            	a = enterNumber("a");
            	validateA = validateA(a);
            } catch (ArithmeticException e) {
            	System.out.println(e.getMessage());
            }
        }
		
		Integer b = enterNumber("b");
		
        System.out.println("The equation you just entered: " + a + "x + " + b + " = 0.");
        
    	root = (double)-b / a;
        System.out.println("This equation has root x = " + decimalFormat.format(root) + ".");
    }
    
	private static Integer enterNumber(String num) {
		Integer number = null;
		do {
			try {
				System.out.println("Enter " + num + ": ");
				number = Integer.parseInt(ip.nextLine());
				return number;
			} catch (NumberFormatException  e) {
				System.out.println("Please enter a number");
			}
		} while (true);
	}
	
	private static boolean validateA(Integer a) {
		boolean result = true;
		if (a == 0) {
			result = false;
			throw new ArithmeticException("a must be different from 0");
		}
		return result;
	}
}

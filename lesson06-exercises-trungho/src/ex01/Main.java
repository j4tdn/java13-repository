package ex01;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        
        double root;
        
		String inputA = enterNumber("a");
		int a = Integer.parseInt(inputA);
		
		String inputB = enterNumber("b");
		int b = Integer.parseInt(inputB);
		
        System.out.println("The equation you just entered: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("This equation has countless roots.");
            } else {
                System.out.println("This equation has no root.");
            }
        } else {
        	root = (double) -b / a;
            System.out.println("This equation has root x = " + decimalFormat.format(root) + ".");
        }
    }
    
	private static String enterNumber(String num) {
		String numberString = null;
		do {
			System.out.println("Enter " + num + ": ");
			numberString = ip.nextLine();
		} while (!numberString.matches("\\d+"));
		return numberString;
	}
}

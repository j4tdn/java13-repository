package exception;

import java.time.Year;
import java.util.Scanner;
/*
 * enter year of birth >> calculate age
 * opt2: try (place code could cause exception)
 * 		Catch (inform exception , or handle exception)
 * 		and back to normal flow program
 */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("Enter year of birth: ");
		
		int yob = 0;
		try {
			// block scope
			// NumberFormatException
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Age: " + ( cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("back to main method");
		
	}
}

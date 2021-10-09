package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter year of birth >> calculate age of candidate
 * Opt2: Try(place code should cause exception)
 * 		 Catch(inform exception, or handle ...
 *		 ...
 */

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int yearOfBirth;
		try {
			// block scope
			// NumberFormatte
			System.out.println("Enter year of birth: ");
			yearOfBirth = Integer.parseInt(ip.nextLine());
			int currentYear = Year.now().getValue();
			System.out.println("Age: " + (currentYear - yearOfBirth));
			// 100 lines
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Back to Main method");
	}
	
}

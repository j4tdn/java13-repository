package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * Enter a year of birth >> Calculate age of candidate
 * Opt2: Try (place code could cause exception)
 *       Catch (inform exception, or handle exception)
 *       And back to normal flow program
 */
public class Ex02 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int year = 0;

		try {
			// block scope
			System.out.print("Enter year of birth: ");
			year = Integer.parseInt(sc.nextLine());
			int currentYear = Year.now().getValue();
			System.out.println("Age: " + (currentYear - year));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Back to Main method");
	}
}
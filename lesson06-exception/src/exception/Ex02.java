package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> calculate age of candidate
 * Opt2: Try (place code could cause exception)
 *       Catch (inform exception, or handle exception)
 *       And back to normal flow program
 */

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int yob = 0;
		try {
			// block scope
			// NumberFormatException 
			System.out.println("Enter year of birth: ");
			yob = Integer.parseInt(ip.nextLine()); // year of birth
			int  cry = Year.now().getValue(); // current year
			System.out.println("Age: " + (cry - yob));
		// 	Dòng nào bị exception => xuống catch luôn chứ ko run theo thứ tự 
		} catch (NumberFormatException e) {
			e.printStackTrace(); // print exception and still continue below code
		                         // In catch method => don't use sysout
		}
		
		System.out.println("Back to Main method"); // Đối với try-catch dù có bị exception đi nữa thì vẫn chạy xuống dòng này
	}

}

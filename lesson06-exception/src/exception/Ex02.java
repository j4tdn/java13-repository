package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth  >> calculate age of candidates
 * Opt 2: try(place code could cause exception) 
 * 		  catch(inform exception, or handle exception)
 * 		  And back to normal flow program
 */
public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {

		int yob = 0;

		try {
			System.out.print("Enter year of birth: ");
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Age: " + (cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Back to main method");
	}
}

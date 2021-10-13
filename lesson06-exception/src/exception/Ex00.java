package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> calculate age of candidate
 */

public class Ex00 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine()); // year of birth
		int  cry = Year.now().getValue(); // current year
	
		System.out.println("Age: " + (cry - yob));
	}

}

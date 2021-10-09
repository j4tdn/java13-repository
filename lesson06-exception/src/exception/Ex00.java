package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth  >> calculate age of candidates
 */
public class Ex00 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		int cry = Year.now().getValue();
		
		System.out.println("Age: " + (cry - yob));
	}
}

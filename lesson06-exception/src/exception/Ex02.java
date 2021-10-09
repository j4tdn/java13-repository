package exception;

import java.time.Year;
import java.util.Scanner;

public class Ex02 {
	
	private static Scanner ip = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = 0;
		try {
		yob = Integer.parseInt(ip.nextLine());
		int cry = Year.now().getValue();
		System.out.println("Age: " + (cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Back to Main method");
	} 
	
}

package exception;

import java.time.Year;
import java.util.Scanner;
/*
 * 
 * opt2:
 * */
public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob=0;
		try {
			//block scope
			//NumberFormatException
			yob = Integer.parseInt(ip.nextLine());
			int cry = Year.now().getValue();
			System.out.println("Aeg: " + (cry - yob));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Back to Main method");
	}
}

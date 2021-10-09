package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Enter a year of birth >> Calculate age of candidate
 * Opt2: Try catch
 */
public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int yearOfBirth = 0;
		while (true) {
			try {
				System.out.print("Enter year of birth: ");
				yearOfBirth = Integer.parseInt(sc.nextLine());
				int year = Year.now().getValue();
				System.out.println("Age: " + (year - yearOfBirth));
				break;
			} catch (NumberFormatException ex) {	
				ex.printStackTrace();
			}
		}
		System.out.println("Main Method");
	}
}

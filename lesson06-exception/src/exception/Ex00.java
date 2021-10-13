package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * Enter a year of birth >> Calculate age of candidate
 *
 */
public class Ex00 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int year = Integer.parseInt(sc.nextLine());

		int currentYear = Year.now().getValue();

		System.out.println("Age: " + (currentYear - year));
	}
}
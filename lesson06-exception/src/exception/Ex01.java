package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * Enter a year of birth >> Calculate age of candidate
 * Op1: Validate before processing function
 *
 */
public class Ex01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {


		// Validate
		String yearInput = enterYear();

		int year = Integer.parseInt(yearInput);

		int currentYear = Year.now().getValue();

		System.out.println("Age: " + (currentYear - year));


	}

	private static String enterYear() {
		String yearInput = null;
		do {
			System.out.println("Enter year of birth: ");
			yearInput = sc.nextLine();

		} while(!yearInput.matches("\\d+")); // !isNumber(yearInput)

		return yearInput;
	}

	public static boolean isNumber(String input) {

		for(int i = 0; i < input.length(); i++) {
			// input.charAt(i) < '0' || input.charAt(i) > '9'
			if(!Character.isDigit(input.charAt(i))) {
				return false;
			};
		}

		return true;
	}
}
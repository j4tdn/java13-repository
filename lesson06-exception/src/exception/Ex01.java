package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> calculate age of candidate 
 * Opt1: Validate before processing function
 */
public class Ex01 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Validate yobAsString should be a valid number >> match(bieuthuc)
		// 123456789, hello, 24, welcome, 3be65
		String yobAsString = enterYear();
		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();
		System.out.println("Age: " + (cry - yob));
	}
	
	private static String enterYear() {
		String yobAsString = null;
		do {
			System.out.print("Enter year of birth(valid number): ");
			yobAsString = ip.nextLine();
		} while (!yobAsString.matches("\\d+")); // !isNumber(yobAsString)
		return yobAsString;
	}

	private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			// 0 1 2 3 4 5 6 7 8 9 >> letter < '0' || letter > '9'
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}

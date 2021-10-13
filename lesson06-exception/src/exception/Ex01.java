package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Enter a year of birth >> Calculate age of candidate
 * Opt1: Validate before processing
 */
public class Ex01 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// validate
		String yearOfBirthasString = enterYear();

		int yearOfBirth = Integer.parseInt(yearOfBirthasString);
		int year = Year.now().getValue();

		System.out.println("Age: " + (year - yearOfBirth));

	}

	private static String enterYear() {
		String yearOfBirthasString = null;
		do {
			System.out.print("Enter year of birth (valid number): ");
			yearOfBirthasString = sc.nextLine();
		}
		// while(!isNumber(yearOfBirthasString));
		while (!yearOfBirthasString.matches("\\d+"));
		return yearOfBirthasString;
	}

	private static boolean isNumber(String yearOfBirthasString) {
//		char[] chars = yearOfBirthasString.toCharArray();
//		for(char i: chars) {
//			if(!Character.isDigit(i)) {
//				return false;
//			}
//		}
//		return true;
		if (yearOfBirthasString.length() == 0) {
			return false;
		}
		for (int i = 0; i < yearOfBirthasString.length(); i++) {
			char letter = yearOfBirthasString.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}
}
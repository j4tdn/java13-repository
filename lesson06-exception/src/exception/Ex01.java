package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Enter a year of birth >> calculate age of candidate
 * Opt1: Validate before handling
 */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		//
		String yobAsString = enterYear();
		
		int yearOfBirth = Integer.parseInt(yobAsString);
		int nowYear = Year.now().getValue();

		System.out.println("Age: " + (nowYear - yearOfBirth));


	}

	private static String enterYear() {
		String yobAsString = null;
		do {
			System.out.println("Enter year of birth: ");
			yobAsString = ip.nextLine();
		}while(!yobAsString.matches("\\d+")); //!isNumber(yobAsString)
		
		return yobAsString;
	}
	
	private static boolean isNumber(String sequence) {
		for(int i = 0; i < sequence.length(); i++) {
			char letter = sequence.charAt(i);
			// 0 1 2 3 4 5 6 7 8 9 >> letter < '0' || letter > '9'
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}

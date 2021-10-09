package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * Enter a year of birth >> calculate age of candidate
 * Opt1: Validate before processing function
 */

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Validate yobAsString should be a valid number >> match(biểu thức)
		// 123456789 , hello, 24, welcome, 3be65
		String yobAsString = enterYear();
		
		int yearOfBirth = Integer.parseInt(yobAsString);
		int currentYear = Year.now().getValue();
		
		System.out.println("Age: " + (currentYear - yearOfBirth));
	}
	
	private static String enterYear() {
		String yobAsString = null;
		do {
			System.out.println("Enter year of birth: ");
			yobAsString = ip.nextLine();
		}while(yobAsString.matches("\\d+")); // !isNumber(yobOfString)
		return yobAsString;
	}
	
	private static boolean isNumber(String sequence) {
		for(int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}

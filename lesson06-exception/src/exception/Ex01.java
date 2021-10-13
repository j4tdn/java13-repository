package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> calculate age of candidate
 * Opt1: Validate before processing function (bắt lỗi trước khi gọi hàm)
 */

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Validate yobAsString should be a valid number >> match (kiểm tra xem có thỏa mãn với biểu thức hay ko)
		String yobAsString = enterYear();	
		int yob = Integer.parseInt(yobAsString); // year of birth
		int cry = Year.now().getValue(); // current year
			
			System.out.println("Age: " + (cry - yob));
		}
	
	private static String enterYear() {
		String yobAsString = null;
		do {
			System.out.println("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
		} while (!yobAsString.matches("\\d+")); // !isNumber(yobAsString)
		// "\\d+" => "" > String; \\d+ > print \d+; \d+ > [0-9]	
		return yobAsString;
	}

		private static boolean isNumber(String sequence) {
			for (int index = 0; index < sequence.length(); index++) {
				char letter = sequence.charAt(index);
				if (!Character.isDigit(letter)) {
					return false;
				}
			}
			return true;	
	}
}

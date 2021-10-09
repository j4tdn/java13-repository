package exception;

import java.time.Year;
import java.util.Scanner;


public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String yobAsString = null;
		
		do {
			System.out.println("Enter year of birth(valid number): ");
			yobAsString = ip.nextLine();
		} while (!isNumber(yobAsString));			
		
		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();
		
		System.out.println("Age: " + (cry - yob));
	
	}
	
	private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			if (Character.isDigit(letter)) {
				return false;
			}
		}
		return false;
}
}

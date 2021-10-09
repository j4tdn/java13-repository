package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth  >> calculate age of candidates
 * Opt 1: validate before processing
 */
public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		//validate yobAsString should be a valid number
		String yobAsString = enterYear();

		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();

		System.out.println("Age: " + (cry - yob));
	}
	private static String enterYear() {
		String yobAsString = null;
		do {
			System.out.print("Enter year of birth (Invalid number): ");
			yobAsString = ip.nextLine();
			
		}while(!yobAsString.matches("\\d+"));
		
		return yobAsString;
	}
	
	private static boolean isNumber(String sequence) {
		for(int i = 0; i<sequence.length();i++) {
//			if(sequence.charAt(i)<'0'||sequence.charAt(i)>'9') return false;
			if(!Character.isDigit(sequence.charAt(i))) return false;
		}
		return true;
	}
}

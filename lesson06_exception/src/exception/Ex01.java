package exception;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.print("Enter year of birth: ");
		
		// validate
		String yobAsString = enterYear();
		int yob = Integer.parseInt(yobAsString);
		int cry = Year.now().getValue();
		System.out.println("Age: " + ( cry - yob));
		
	}
	
	private static boolean isNumber(String sequence) {
		
		for(int i = 0; i < sequence.length(); i++ ) {
			char letter = sequence.charAt(i);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
	
	private static String enterYear() {
		String yobAsString;
		do{
			System.out.print("Enter year of birth (valid number): ");
			yobAsString = ip.nextLine();
			
		}while(!yobAsString.matches("\\d+"));
		return yobAsString;
	}
}

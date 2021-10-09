package exception;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * Enter a year of brith >> calculate age of candidate
 * Opt1 : validate before processing funtion
 *
 */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String yobAsString = null;
		do{
			System.out.print("Enter year of brith: ");
			yobAsString = ip.nextLine();
		}while(!isNumber(yobAsString));
		
		//Validate yobAsString should be a valid number
			int yob = Integer.parseInt(yobAsString);
			int cry = Year.now().getValue();
			
			System.out.println("Age: " + (cry - yob) );
	}
	private static boolean isNumber(String sequence) {
		for(int index = 0;index < sequence.length();index++) {
			char letter = sequence.charAt(index);
			if(!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}

}

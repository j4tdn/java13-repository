package exception;

import java.time.Year;
import java.util.Iterator;
import java.util.Scanner;

/*
 * enter a year of birth>>calculate age of candidate
 * opt1:Validate before processing function
 * 
 */

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String yobAsString =enterYear();
		int yob = Integer.parseInt(yobAsString);
		int cry= Year.now().getValue();
			
		System.out.println("Age: "+(cry-yob));
		
	}
	private static String enterYear() {
		String yobAsString=null;
		do {
			System.out.println("Enter year of birth: ");
			yobAsString=ip.nextLine();
		}while(!yobAsString.matches("\\d+"));//(!isNumber(yobAsString));
		return yobAsString;
	}
	private static boolean isNumber(String sequence) {
		for(int index=0;index<sequence.length();index++) {
			if(!Character.isDigit(sequence.charAt(index))) {
				return false;
			}
		}
		return true;
	}
}

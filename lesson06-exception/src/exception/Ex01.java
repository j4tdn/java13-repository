package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * enter a year of birth >> calculate age of candidate
 * opt1: Validate before processing
 * */
public class Ex01 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		//System.out.println("Enter year of birth: ");
		//String yobAsString = ip.nextLine();
		String yobAsString = enterYear();
		int yob = Integer.parseInt(yobAsString);

		int cry = Year.now().getValue();

		System.out.println("Aeg: " + (cry - yob));
		/*String yobAsString = null;
		 do{System.out.println("Enter year of birth(invalid number): ");
		 yobAsString = ip.nextLine();}
	C1	while(true) {
			yobAsString = ip.nextLine();
			if(isNumber(yobAsString)) {
				break;
			}	
    C2   while(yobAsString.matches("\\d+")) {
			int yob = Integer.parseInt(yobAsString);

			int cry = Year.now().getValue();

			System.out.println("Aeg: " + (cry - yob));
			}	
		}*/
		/*if (isNumber(yobAsString)) {
			int yob = Integer.parseInt(yobAsString);

			int cry = Year.now().getValue();

			System.out.println("Aeg: " + (cry - yob));
		}
		// }
		else {
			System.out.println("Invalid number!!!");
		}*/
	}
	private static String enterYear() {
		String yobAsString = null;
		do {System.out.println("Enter year of birth(invalid number): ");
		 yobAsString = ip.nextLine();}
		while(yobAsString.matches("\\d+"));
		return yobAsString;
	}

	private static boolean isNumber(String sequence) {
		for (int index = 0; index < sequence.length(); index++) {
			char letter = sequence.charAt(index);
			// letter<'0'||letter>9
			if (!Character.isDigit(letter)) {
				return false;
			}
		}
		return true;
	}
}

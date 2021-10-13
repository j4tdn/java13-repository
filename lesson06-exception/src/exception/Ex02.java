package exception;

import java.time.Year;
import java.util.Scanner;
/*
 * Enter a year of birth >> calculate age of candidate
 * Opt2: 
 * 		Try(place code could cause exception)
 * 		Catch(inform exception, or handle exception)
 * 		And back to normal flow program
 */
public class Ex02 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		

		int yob = 0;

		while(true) {
			try {
				//block scope
				//NumberFormatException
				System.out.println("Enter Year Of Birth: ");
				yob = Integer.parseInt(ip.nextLine());
				
				int nowYear = Year.now().getValue();
				System.out.println("Age: " + (nowYear - yob)); 
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Back to Main method");

	}
}

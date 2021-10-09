package exception;

import java.time.Year;
/*
 * enter a year of birth>>calculate age of candidate
 * opt2:Try
 * 			catch
 * 
 */
import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		
		
		int yob=0;
		try {
			//block scope
			yob = Integer.parseInt(ip.nextLine());
			int cry= Year.now().getValue();
			System.out.println("Age: "+(cry-yob));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("back to main method");
	}
}

package exception;

import java.time.Year;
import java.util.Scanner;
/*
 * Enter a year of birth >> calculate age of candidate
 */
public class Ex00 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Year Of Birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		int nowYear = Year.now().getValue();
		
		System.out.println("Age: " + (nowYear - yob)); 
	}
}

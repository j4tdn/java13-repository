package exception;

import java.time.Year;
import java.util.Scanner;

/*
 * Enter a year of birth >> Calculate age of candidate
 */
public class Ex00 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter year of birth: ");
		int yearOfBirth = Integer.parseInt(sc.nextLine());
		int year = Year.now().getValue();
		
		System.out.println("Age: " + (year-yearOfBirth));
	}
}
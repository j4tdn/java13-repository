package exeption;

import java.time.Year;
import java.util.Scanner;

public class Ex01 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int year = Integer.parseInt(ip.nextLine());
		int cry = Year.now().getValue();
		System.out.println("Age: " + (cry - year));
	}
}

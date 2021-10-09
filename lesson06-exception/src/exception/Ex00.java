package exception;

import java.time.Year;
import java.util.Scanner;

public class Ex00 {
	
	private static Scanner ip = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.println("Enter year of birth: ");
		int yob = Integer.parseInt(ip.nextLine());
		int cry = Year.now().getValue();
		
		
		System.out.println("Age: " + (cry - yob));
	} 
	
}

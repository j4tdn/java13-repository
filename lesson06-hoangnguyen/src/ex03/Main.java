package ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isContinue = "y";
		String email;
		do {
			System.out.print("Input your email: ");
			email = sc.nextLine();
			System.out.println(email + " is " + (validateEmail(email) ? "valid" : "invalid"));
			
		} while("y".equalsIgnoreCase(isContinue));
	}
	
	private static boolean validateEmail(String email) {
		String regex = "[^@][0-9a-zA-Z]*@([a-z]+\\.[a-z]+|[a-z]+\\.[a-z]+\\.[a-z]+)";
		return email.matches(regex);
	}
}

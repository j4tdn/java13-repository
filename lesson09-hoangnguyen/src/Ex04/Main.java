package Ex04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isContinue = "y";
		do {
			try {
				input();
				System.out.println("Register successfully !!!");
				
			} catch (PasswordValidateException e) {
				System.out.println(e.getMessage());
				System.out.println("Please try again");
				System.out.println("Do you want try again? [Y/N]");
				isContinue = sc.nextLine();
			}
			
			System.out.println("Do you want try again? [Y/N]");
			isContinue = sc.nextLine();

		} while ("y".equalsIgnoreCase(isContinue));
	}
	
	private static void input() throws PasswordValidateException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		
		if(!pwd.matches(".{8,}")) {
			throw new PasswordValidateException("Password at least 8 characters");
		}
		
		if (!pwd.matches(".*([A-Z]+).*")) {
			throw new PasswordValidateException("Password at least one uppercase alphabetic character (A, B, C...)");
		}

		if (!pwd.matches(".*([0-9]+).*")) {
			throw new PasswordValidateException("Password at least one number (1, 2, 3)");
		}

		if (!pwd.matches("(?=.*[@#$%^&+=])")) {
			throw new PasswordValidateException("Password at least one special character");
		}
		
		if()
	}

}

package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isContinue = "y";
		String password;
		do {
			System.out.print("Enter the password: ");
			password = sc.nextLine();

			try {
				validatePassword(password);
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

	private static boolean validatePassword(String pwd) throws PasswordValidateException {

		if (!pwd.matches(".{8,}")) {
			throw new PasswordValidateException("Password at least 8 characters");
		}

		if (!pwd.matches(".{8,256}")) {
			throw new PasswordValidateException("Password at most 256 characters");
		}

		if (!pwd.matches(".*([a-z]+).*")) {
			throw new PasswordValidateException("Password at least one lowercase alphabetic character (a, b, c...)");
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

		return true;
	}
}

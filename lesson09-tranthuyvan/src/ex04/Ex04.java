package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String account = scn.nextLine();
		System.out.println("Please enter account's name: ");

		String password;
		while (true) {
			System.out.println("Please enter a password: ");
			try {
				password = enterPassword();
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("message " + e.getMessage());
			}
		}

	}

	public static String enterPassword() throws Exception {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if (password.length() < 8) {
			throw new Exception("Password must have at least 8 characters!!!");
		}

		if (password.toUpperCase().equals(password)) {
			throw new Exception("Password must have at least 1 lowercase alphabetic character (a,b,c...)");
		}

		if (password.toLowerCase().equals(password)) {
			throw new Exception("Password must have at least 1 uppercase alphabetic character (A,B,C...)");
		}
		if (!hasNumber(password)) {
			throw new Exception("Password must have at least 1 number (1,2,3...)");
		}
		if (!hasSpecialCharacter(password)) {
			throw new Exception("Password must have at least 1 special character (~!@#$%^&*()_=+[]{}|;:,.<>/?)!!!\")");
		}

		return password;
	}

	private static boolean hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i)));
			return true;
		}
		return false;
	}

	private static boolean hasSpecialCharacter(String password) {
		String schar = "~!@#$%^&*()_=+[]{}|;:,.<>/?"; // schar = special character
		for (int i = 0; i < schar.length(); i++) {
			if (password.contains("" + schar.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}

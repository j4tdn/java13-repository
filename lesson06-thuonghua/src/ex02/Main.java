package ex02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Create a new password");
		String password = null;
		do {
			try {
				System.out.print("Password:");
				password = ip.nextLine();
				CheckPassword(password);
				System.out.println("Created a new password!!!");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Retype!!!!");
			}
		} while (true);

	}

	private static Boolean CheckPassword(String password) throws Exception {
		if (Pattern.matches("\\A(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!.@#$%^&+=])(?=\\S+$).{8,}\\z", password)) {
			return true;
		} else {
			throw new Exception("Error: ...");
		}

	}
}

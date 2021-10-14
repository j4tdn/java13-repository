package ex03;

import java.util.Scanner;

/**
 * Bài 3: Viết chương trình cho phép nhập địa chỉ email từ bàn phím. Kiểm tra
 * email nếu không hợp lệ thì thông báo lỗi vào yêu cầu nhập lại cho đến khi hợp
 * lệ và in ra.
 * 
 * @author tranc
 *
 */
public class Main {

	public static void main(String[] args) {
		String email = "";
		while (true) {
			try {
				email = enterEmail();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("Email: " + email);

	}

	public static String enterEmail() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email: ");
		String mail = sc.nextLine();
		if (!mail.contains("@")) {
			throw new Exception("Email address must have @.");
		}
		String prefix = mail.substring(0, mail.indexOf("@"));
		String domain = mail.substring(mail.indexOf("@") + 1, mail.length());
		if (prefix.equals("")) {
			throw new Exception("Email address must have prefix.");
		}
		if (domain.equals("")) {
			throw new Exception("Email address must have domain.");
		}
		if (!containAllowedCharacter(prefix)) {
			throw new Exception("Prefix contains unallowed characters!!!");
		}
		if (prefix.startsWith(".") || prefix.startsWith("-") || prefix.startsWith("_")) {
			throw new Exception("Prefix is not allowed to have special chracters at beginning!");
		}
		if (prefix.endsWith(".") || prefix.endsWith("-") || prefix.endsWith("_")) {
			throw new Exception("Prefix is not allowed to have special chracters at ending!");
		}
		for (int i = 0; i < prefix.length(); i++) {
			if (isProperSpecialCharacter(prefix.charAt(i))) {
				if (isProperSpecialCharacter(prefix.charAt(i + 1))) {
					throw new Exception(
							"An underscore, period, or dash must be followed by one or more letter or number");
				}
			}
		}
		if(!domain.contains("mail.com")) {
			throw new Exception("\"mail.com\" is the email domain!");
		}
		return mail;

	}

	public static boolean containAllowedCharacter(String prefix) {
		for (int i = 0; i < prefix.length(); i++) {
			if (!isProperCharacter(prefix.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private static boolean isProperCharacter(char character) {
		if (!Character.isLetterOrDigit(character) && !isProperSpecialCharacter(character)) {
			return false;
		}
		return true;
	}

	private static boolean isProperSpecialCharacter(char character) {
		if (character == '_' || character == '.' || character == '-') {
			return true;
		}
		return false;
	}
}

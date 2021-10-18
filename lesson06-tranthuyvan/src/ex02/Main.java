package ex02;

import java.util.Scanner;

/**
 * Bài 2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài
 * khoản Mật khẩu phải thỏa mãn các điều kiện sau đây: MUST CONTAIN: + At least
 * 8 characters + At most 256 characters + At least 1 lowercase alphabetic
 * character (a,b,c...) + At least 1 uppercase alphabetic character (A,B,C...) +
 * At least 1 number (1,2,3...) + At least 1 special character
 * (~!@#$%^&*()_=+[]{}|;:,.<>/?) MUST NOT CONTAIN + your name or email address
 */

public class Main {
	public static void main(String[] args) {

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
		if (password.length() > 256) {
			throw new Exception("Password must have at most 256 characters!!!");
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
		if (password.contains("name")) {
			throw new Exception("Password must not contain your name");
		}
		if (password.contains("acb@gmail.com")) {
			throw new Exception("Password must not contain your email");
		}
		return password;
	}

	private static boolean hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i)))
				;
			return true;
		}
		return false;
	}

	private static boolean hasSpecialCharacter(String password) {
		String schar = "~!@#$%^&*()_=+[]{}|;:,.<>/?"; // schar = specail character
		for (int i = 0; i < schar.length(); i++) {
			if (password.contains("" + schar.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}

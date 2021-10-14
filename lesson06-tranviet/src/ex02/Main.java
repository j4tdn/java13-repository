package ex02;

import java.util.Scanner;

/**
 * Bài 2: Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài
 * khoản Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra
 * điều kiện cho đến khi đăng ký tài khoản thành công.
 * 
 * @author tranc
 *
 */
public class Main {
	public static void main(String[] args) {

		String password = "";
		while (true) {
			System.out.print("Enter a password: ");
			try {
				password = enterPassword();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Password is: " + password);
	}

	public static String enterPassword() throws Exception {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if (password.length() < 8) {
			throw new Exception("<EXCEPTION> At least 8 characters!!!");
		}
		if (password.length() > 256) {
			throw new Exception("<EXCEPTION> At most 256 characters!!!");
		}
		if (password.toUpperCase().equals(password)) {
			throw new Exception("<EXCEPTION> At least 1 lower alphabetic character (a,b,c,...)!!!");
		}
		if (password.toLowerCase().equals(password)) {
			throw new Exception("<EXCEPTION> At least 1 uppercase alphabetic character (A,B,C,...)!!!");
		}
		if (!hasNumber(password)) {
			throw new Exception("<EXCEPTION> At least 1 number (1,2,3,...)!!!");
		}
		if (!hasSpecialCharacter(password)) {
			throw new Exception("<EXCEPTION> At least 1 special character (~!@#$%^&*()_=+[]{}|;:,.<>/?)!!!");
		}
		if (password.contains("tranviet")) {
			throw new Exception("<EXCEPTION> Must not contain your name!!!");	
		}
		if (password.contains("0710")) {
			throw new Exception("<EXCEPTION> Must not contain your birthday!!!");	
		}
		return password;
	}

	private static boolean hasSpecialCharacter(String password) {
		String specialChracter = "~!@#$%^&*()_=+[]{}|;:,.<>/?";
		for (int i = 0; i < specialChracter.length(); i++) {
			if (password.contains("" + specialChracter.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}

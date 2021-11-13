/**
 * Bài 4(20đ): Viết chương trình thực hiện chức năng đăng ký tài khoản
	B1. Nhập tên tài khoản ví dụ byztkhx256
	B2. Nhập mật khẩu admin123
	Yêu cầu mật khẩu như sau:
	1. Độ dài mật khẩu: >= 8
	2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
	3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
	Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 */
package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = "";
		String password = "";
		System.out.println("====== ĐĂNG KÝ TÀI KHOẢN =======");
		System.out.print("Username: ");
		username = sc.nextLine();
		do {
			try {
				System.out.print("Password: ");
				password = sc.nextLine();
				if (isValid(password, username)) {
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);
		System.out.println("Đăng ký tài khoảng thành công!!!");
		sc.close();
	}

	private static boolean isValid(String password, String username) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Độ dài mật khẩu: >= 8");
		}
		if (!containDigits(password)) {
			throw new Exception("Có ít nhất 1 chữ số");
		}
		if (!containUppercaseCharacter(password)) {
			throw new Exception("Có ít nhất 1 kí tự in hoa");
		}
		if (!containSpecialCharacter(password)) {
			throw new Exception("Có ít nhất 1 kí tự đặc biệt");
		}
		if (matchOver3Characters(password, username)) {
			throw new Exception("Không được trùng quá 3 ký tự với tên tài khoản");
		}
		return true;
	}

	private static boolean matchOver3Characters(String password, String username) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < username.length(); j++) {
				if (password.charAt(i) == username.charAt(j)) {
					count++;
					continue;
				}
			}
		}
		if (count >= 3) {
			return true;
		}
		return false;
	}

	private static boolean containDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean containUppercaseCharacter(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	private static boolean containSpecialCharacter(String password) {
		String specialCharacters = "~!@#$%^&*";
		for (int i = 0; i < specialCharacters.length(); i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == specialCharacters.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}

}

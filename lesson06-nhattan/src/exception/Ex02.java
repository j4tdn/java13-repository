package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password;
		while (true) {
			try {
				System.out.println("Nhập mật khẩu: ");
				password = ip.nextLine();
				if (checkPassword(password)) {
					System.out.println("Hợp lệ.");
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}

	}

	private static boolean checkPassword(String password) {
		Pattern pleast = Pattern.compile("^.{8,}$");
		Pattern pMost = Pattern.compile("^.{1,256}$");
		Pattern pDigit = Pattern.compile("[0-9]");
		Pattern pLowerLetter = Pattern.compile("[a-z]");
		Pattern pUpperLetter = Pattern.compile("[A-Z]");
		Pattern pSpecialCharacter = Pattern.compile("[^A-Za-z0-9]");
		Pattern pWhitespace = Pattern.compile(" ");

		if (!pleast.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu phải có ít nhất 8 kí tự");
		} else if (!pMost.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu không nhỏ hơn 256 kí tự");
		} else if (!pDigit.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu phải có ít nhất 1 kí tự số");
		} else if (!pLowerLetter.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu phải có ít nhất 1 chữ cái thường");
		} else if (!pUpperLetter.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu phải có ít nhất 1 chữ cái hoa");
		} else if (!pSpecialCharacter.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu phải có ít nhất 1 kí tự đặc biệt");
		} else if (pWhitespace.matcher(password).find()) {
			throw new RuntimeException("Mật khẩu không thể có kí tự khoảng trắng");
		} else {
			return true;
		}
	}
}

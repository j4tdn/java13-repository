package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		while (true) {
			try {
				System.out.println("Nhập email: ");
				email = ip.nextLine();
				if (checkEmail(email)) {
					System.out.println("Hợp lệ.");
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
	}

	private static boolean checkEmail(String email) {
		Pattern pDomain = Pattern.compile("@mail.com$");
		Pattern pFrefix = Pattern.compile("^[a-z0-9\\._-]+@");
		Pattern pFollowed = Pattern.compile("^([a-z0-9]+[\\._-]?[a-z0-9])+@");

		if (!pDomain.matcher(email).find()) {
			throw new RuntimeException("Email phải có miền @mail.com");
		} else if (!pFrefix.matcher(email).find()) {
			throw new RuntimeException("Email chỉ có thể có chữ cái, số, dấu gạnh dưới, dấu chấm và dấu gạch ngang");
		} else if (!pFollowed.matcher(email).find()) {
			throw new RuntimeException(
					"Dấu gạnh dưới, dấu chấm và dấu gạch ngang phải theo sau bởi 1 hoặc nhiều chữ hoặc số");
		}

		return true;
	}
}

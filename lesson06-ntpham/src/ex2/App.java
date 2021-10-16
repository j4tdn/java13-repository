package ex2;

import java.util.Scanner;

/**
 * 
	Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
	Mật khẩu phải thỏa mãn các điều kiện sau đây. Lặp lại các bước kiểm tra điều kiện cho đến khi
	đăng ký tài khoản thành công.
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("============Create a new password=============");
		String pwd = "";
		do {
			System.out.println("Enter your password: ");
			try {
				pwd = enterPassword();
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		} while(true);
		System.out.println("Your password is : " + pwd);
	}
	
	public static String enterPassword() throws Exception{
		Scanner input = new Scanner(System.in);
		String pwd = input.nextLine();
		input.close();
		if (pwd.length() < 8) throw new Exception("ERROR!! At least 8 characters");
		if (pwd.length() > 256) throw new Exception("ERROR!! At most 256 characters");
		if (pwd.toUpperCase().equals(pwd)) throw new Exception("ERROR!! At least 1 lowercase alphabetic");
		if (pwd.toLowerCase().equals(pwd)) throw new Exception("ERROR!! At least 1 uppercase alphabetic");
		if (!isHaveNumber(pwd)) throw new Exception("ERROR!! At least 1 number");
		if (!isHaveSpecialNumber(pwd)) throw new Exception("ERROR!! At least 1 special character");
		if (pwd.contains("nguyen")) throw new Exception("ERROR!! Must not contain your name");
		if (pwd.contains("13901")) throw new Exception("ERROR!! Must not contain email address");	
		return pwd;
	}
	
	
	public static boolean isHaveNumber(String pwd) {
		for (int i = 0; i < pwd.length(); i++) {
			if (Character.isDigit(pwd.charAt(i))) return true;
		}
		return false;
	}
	
	public static boolean isHaveSpecialNumber(String pwd) {
		String specialChar = "~!@#$%^&*()_=+[]{}|;:,.<>/?";
		for (int i = 0; i < specialChar.length(); i++) {
			if (pwd.contains("" + specialChar.charAt(i))) return true;
		}
		return false;
	}
	
}

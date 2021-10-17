package baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
 * Mật khẩu phải th�?a mãn các đi�?u kiện sau đây. 
 * Lặp lại các bước kiểm tra đi�?u kiện cho đến khi đăng ký tài khoản thành công.
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		while(true) {
			System.out.println("Enter password:");
			password = input.nextLine();
			try {
				if(isValidPassword(password)) {
					System.out.println("Sign in success");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean isValidPassword(String password) throws Exception {
		if(password.length() < 8 ) {
			throw new Exception("PassWord must contain at least 8 character");
		}
		if(password.length() > 256 ) {
			throw new Exception("PassWord must contain at most 256 character");
		}
		if(!Pattern.matches(".*[a-z].*", password) ) {
			throw new Exception("PassWord must contain at least 1 lowwer aphabetic character (a,b,c,..)");
		}
		if(!Pattern.matches(".*[A-Z].*", password) ) {
			throw new Exception("PassWord must contain at least 1 upper aphabetic character (A,B,C,..)");
		}
		if(!Pattern.matches(".*[0-9].*", password) ) {
			throw new Exception("PassWord must contain at least 1 number");
		}
		if((!Pattern.matches(".*[^a-zA-Z0-9].*", password))  ) {
			throw new Exception("PassWord must contain at least 1 special character.");
		}
		if(password.contains(" ")) {
			throw new Exception("Pass work must not contain space character");
		}
		return true;		
		
	}
}

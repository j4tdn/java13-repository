package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password , username;
		while(true) {
			try {
				System.out.println("Username: ");
				username = input.nextLine();
				System.out.println("Password: ");
				password = input.nextLine();
				if(isValidPassword(password,username)) {
					System.out.println("Đăng ký thành công");
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean isValidPassword(String password, String username) throws Exception {
		if(password.length() < 8 ) {
			throw new Exception("PassWord must contain at least 8 character");
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
		
		return true;
	}
	
}

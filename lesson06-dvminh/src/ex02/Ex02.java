package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String password = "";
		while(true) {
			try {
				password = isCheckPassword();
				break;

			} catch (Exception e) {
				System.out.println("error :" + e.getMessage());
			}
		}
		System.out.println("password :" + password);
	}
	
	private static String isCheckPassword() throws InvalidPasswordException {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter password: ");
		
		String pw = ip.nextLine();
				
		if (pw.length() < 8 || pw.length() > 255) {
			throw new InvalidPasswordException("Mật khẩu phải đó độ dài hơn hơn 8 và bé hơn 256 kí tự!");
		}
		
		if (!pw.matches(".*[a-z]+.*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất 1 kí tự thường!");
		}
		
		if (!pw.matches(".*[A-Z]+.*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất 1 kí tự hoa!");
		}
		
		if (!pw.matches(".*[0-9].*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất 1 chữ số!");
		}
		
		if (!pw.matches(".*[~!@#$%^&*()_+{}|:<>?-=[].*")) {
			throw new InvalidPasswordException("Mật khẩu phải có ít nhất 1 kí tự đặc biệt!");
		}
		
		return pw;
	}
}

package ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String password = "";
		while(true) {
			try {
				password = LoginAccount();
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Đăng ký tài khoản thành công!!!");
	}
	
	private static String LoginAccount() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		if(password.length() < 8) {
			throw new Exception("Password phải có ít nhất 8 ký tự");
		}
		if(!isDigit(password)) { 
			throw new Exception("Password phải có ít nhất 1 ký tự là số");
		}
		if(!upperCase(password)) {
			throw new Exception("Password phải có ít nhất 1 ký tự in hoa");
		}
		if(specialCharacter(password) == false) {
			throw new Exception("Password phải có ít nhất 1 ký tự đặc biệt");
		}
		if(check(username, password) > 3) {
			throw new Exception("Password không được trùng quá 3 ký tự với username");
		}
		return password;
	}
	
	private static boolean isDigit(String sequence) {
		for(int i = 0;  i < sequence.length(); i++) {
			char c = sequence.charAt(i);
			if(Character.isDigit(c)) {
				return true;
			} 
		}
		return false;
	}
	
	private static boolean upperCase(String sequence) {
		for(int i = 0; i < sequence.length(); i++) {
			 char c = sequence.charAt(i);
			 if(c >= 'A' && c <= 'Z') {
				 return true;
			 }
		 }
		 return false;
	}
	
	private static boolean specialCharacter(String sequence) {
		return sequence.matches("(.*)[^A-Za-z0-9](.*)");
	}
	
	private static int check(String username, String password) {
		int count = 0;
		for(int i = 0; i < username.length(); i++) {
			char u = username.charAt(i);
			for(int j = 0; j < password.length(); j++) {
				
				char p = password.charAt(j);
				
				if(u == p) {
					count ++;
				}
			}
		}
		return count;
	}
}

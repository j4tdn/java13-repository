 package ex02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String password = "";
		while(true) {
			try {
				password = passwordEnter();
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Password: " + password);
		
	}
	
	private static String passwordEnter() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		if(password.length() < 8 ) {
			throw new Exception("Password must have at least 8 charcters");
		}
		 
		if(password.length() > 256) {
			throw new Exception("Password must have  at most 256 characters");
		}
		
		if(!number(password)) { 
			throw new Exception("Password must have at least 1 number");
		}
		
		if(!lowerCase(password)) {
			throw new Exception("Password must have at least 1 lowercase alphabetic");
		}
		
		if(!upperCase(password)) {
			throw new Exception("Password must have at least 1 uppercase alphabetic");
		}
		
		if(specialCharacter(password) == false) {
			throw new Exception("Password must have at least 1 special character");
		}
		
		return password;
	}
	
	private static boolean number(String sequence) {
		for(int i = 0;  i < sequence.length(); i++) {
			char c = sequence.charAt(i);
			if(Character.isDigit(c)) {
				return true;
			} 
		}
		return false;
	}
	
	private static boolean lowerCase(String sequence) {
		 for(int i = 0; i < sequence.length(); i++) {
			 char c = sequence.charAt(i);
			 if(c >= 'a' && c <= 'z') {
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
	
}

package ex04;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name account:");
		String account = ip.nextLine();
		System.out.print("Enter password: ");
		String password = ip.nextLine();
		
		try {
			System.out.println("isSuccessfully: " + validatePassword(account, password));
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	private static boolean checkPass(String account, String pass) {
		int count = 0;
		for(int i = 0; i<pass.length(); i++) {
			if(account.contains(pass.charAt(i)+"")) count++;
		}
		if(count>=3) return false;
		return true;
	}
	private static boolean validatePassword(String account, String pass) throws InvalidPasswordException {
		if(pass.length()<8) {
			throw new InvalidPasswordException("Password can be >=8 characters!");
		}
		if(!pass.matches(".*([A-Z]+).*")) {
			throw new InvalidPasswordException("Password is invalid!");
		}
		if(!pass.matches(".*([0-9]+).*")) {
			throw new InvalidPasswordException("Password is invalid!");
		}
		if(!pass.matches(".*([~!@#$%^&*]+).*")) {
			throw new InvalidPasswordException("Password is invalid!");
		}
		
		if(checkPass(account, pass)==false) {
			throw new InvalidPasswordException("Password is invalid!");
		}
		return true;
	}
}

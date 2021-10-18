package ex02;

import java.util.Scanner;
/*
 * Bai 2: Kiem tra password
 * */
public class App {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int i = 1;
		String pass = null;
		do {
			try {
				System.out.print("Enter password: ");
				pass = ip.nextLine();
				if(validate(pass)) System.out.println("Successful!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if(validate(pass)) break;
				} catch (InvalidPasswordException e) {
					System.out.print("");
				}
				System.out.print("Enter again (1 for 'yes', 0 for 'no'): ");
				i=Integer.parseInt(ip.nextLine());
			}
		} while (i==1);
	}
	
	private static boolean validate(String pass) throws InvalidPasswordException {
		if(!pass.matches(".{8,256}")) {
			throw new InvalidPasswordException("Fail! Password is from 8 to 256 characters");
		}
		if(!pass.matches(".*([a-z]{1,}).*")) {
			throw new InvalidPasswordException("Fail! At least 1 lowercase character");
		}
		if(!pass.matches(".*([A-Z]{1,}).*")) {
			throw new InvalidPasswordException("Fail! At least 1 uppercase character");
		}
		if(!pass.matches(".*([0-9]{1,}).*")) {
			throw new InvalidPasswordException("Fail! At least 1 number character");
		}
		if(!pass.matches("(.*[~!@#$%^&*()-_=+]{1,}).*")) {
			throw new InvalidPasswordException("Fail! At least 1 special character");
		}
		return true;
	}
}

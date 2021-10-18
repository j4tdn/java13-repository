package ex03;

import java.util.Scanner;

/*
 * Bai 3: Kiem tra dinh dang email
 * */
public class App {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a email: ");
		String email = ip.nextLine();
		try {
			if(validateMail(email)) {
				System.out.println("Successful!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static boolean validateMail(String email) throws InvalidMailException {
		
		if(!email.matches("[^[!@#$%^&*]+][0-9A-Za-z]+[_.-]{0,1}[0-9A-Za-z]+@([a-z]+\\.[a-z]+)")) {
			throw new InvalidMailException("Error email!");
		}
		
		return true;
	}
}

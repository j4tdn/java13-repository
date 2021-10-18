package ex02;

import java.util.Scanner;

public class Main {
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
    	String name = "TrungHo";
    	String email = "trunghc.it@gmail.com";
        enterPassword(name, email);
    }
    
	private static String enterPassword(String name, String email) {
		String password = null;
		String strRegEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$)(?!" + name + "|" + email + ").{8,256}$";
		do {
			System.out.println("Enter password: ");
			password = ip.nextLine();
		} while ((!password.matches(strRegEx)));
		System.out.println("Valid password. Thank you!!!");
		return password;
	}
}

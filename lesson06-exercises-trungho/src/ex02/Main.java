package ex02;

import java.util.Scanner;

public class Main {
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
    	// String name = "trunghcit";
    	// String email = "trunghcit@gmail.com";
        enterPassword();
    }
    
	private static String enterPassword() {
		String password = null;
		String strRegEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$)(?!trunghcit|trunghcit@gmail.com).{8,256}$";
		do {
			System.out.println("Enter password: ");
			password = ip.nextLine();
		} while ((!password.matches(strRegEx)));
		System.out.println("Valid password. Thank you!!!");
		return password;
	}
}

package ex03;

import java.util.Scanner;

public class Main {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean validateEmail = false;
        while (!validateEmail) {
        	validateEmail = validateEmail();
        }
        System.out.println("Valid email. Thank you!!!");
	}
	
    private static String enterEmail() {
    	System.out.println("Enter email: ");
    	String email = ip.nextLine();
    	return email;
    }
    
	private static boolean validateEmail() {
		//String prefix = ".*";
		String prefix = "^([a-z]+)([\\d+)(\\-\\_\\.)$]";
		String domain = "@mail\\.com";
		boolean result = true;
		String email = enterEmail();
		if (!email.matches(prefix + domain)) {
			result = false;
			System.out.println("Email format is invalid!");
		}
		return result;
	}
}

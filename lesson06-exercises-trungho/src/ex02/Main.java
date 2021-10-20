package ex02;

import java.util.Scanner;

public class Main {
	private static Scanner ip = new Scanner(System.in);
	
    public static void main(String[] args) {
    	String name = "TrungHo";
    	String email = "trunghc.it@gmail.com";
    	
        boolean validatePassword = false;
        while (!validatePassword) {
            try {
            	validatePassword(name, email);
            	System.out.println("Valid password. Thank you!!!");
            	return;
            } catch (PasswordValidation e) {
            	System.out.println(e.getMessage());
			}
        }
    }
    
    private static boolean validatePassword(String name, String email) throws PasswordValidation {
    	boolean result = true;
    	
    	String password = enterPassword();
    	
    	if(!password.matches(".*(\\d+).*")) {
    		throw new PasswordValidation("Password must contain at least 1 digit");
    	}
    	
    	if(!password.matches(".*([a-z]+).*")) {
    		throw new PasswordValidation("Password must contain at least 1 lowercase letter");
    	}
    	
    	if(!password.matches(".*([A-Z]+).*")) {
    		throw new PasswordValidation("Password must contain at least 1 uppercase letter");
    	}
    	
    	if(!password.matches(".*([!@#$%^&*]+).*")) {
    		throw new PasswordValidation("Password must contain at least 1 special letter");
    	}
    	
    	if(password.matches(".*([\\s]+).*")) {
    		throw new PasswordValidation("Password must not contain space letter");
    	}
    	
    	if(password.matches(".*" + name + ".*")) {
    		throw new PasswordValidation("Password must not contain your name");
    	}
    	
    	if(password.matches(".*" + email + ".*")) {
    		throw new PasswordValidation("Password must not contain your email");
    	}
    	
    	if(!password.matches(".{8,}")) {
    		throw new PasswordValidation("Password must contain at least 8 characters");
    	}
    	
    	if(!password.matches(".{8,256}")) {
    		throw new PasswordValidation("Password must contain at most 256 characters");
    	}
    	return result;
    }
    
    private static String enterPassword() {
    	System.out.println("Enter password: ");
    	String password = ip.nextLine();
    	return password;
    }
}

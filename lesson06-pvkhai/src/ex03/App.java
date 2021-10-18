package ex03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String email = "";
		while(true){
			try {
				email = enterEmail();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
		System.out.println("Email: " + email);
	}
	
	private static String enterEmail() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		
		if(specialCharacte(email)) {
			throw new Exception("No contain special character");
		}
		
//		if(prefixEmail(email)) {
//			throw new Exception("Enter Fail");
//		}
		
		return email;
	}
	
	private static boolean specialCharacte(String sequence) {
		String regex = "(.*)[^A-Za-z0-9_.-](.*)@gmail.com";
		return sequence.matches(regex);
	} 
	
//	private static boolean prefixEmail(String sequence) {
//		return sequence.matches("");
//	}
}

package ex03;

import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String email = "";
		while (true) {
			try {
				email = input();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Email: " + email);
	}

	private static String input() throws Exception {
		System.out.print("Enter Email: ");
		String email = sc.nextLine();
		if (email.substring(0, email.indexOf("@")).length() == 0) {
			throw new Exception("Email address must have prefix");
		}
		if (email.substring(email.indexOf("@") + 1,email.length()).length() == 0) {
			throw new Exception("Email address must have domain");
		}
		
		String[] arStr =email.split("");
		String[] arStr1 =email.substring(0, email.indexOf("@")).split("");
		
		if (arStr[0].matches(".*[\\p{Punct}}].*")) {
			throw new Exception("Prefix is not allowed to have special chracters at beginning");
		}
		
		if (arStr[email.length()-1].matches(".*[\\p{Punct}}].*")) {
			throw new Exception("Domain is not allowed to have special chracters at ending");
		}
		if (arStr1[arStr1.length-1].equals("_") || arStr1[arStr1.length-1].equals(".") || arStr1[arStr1.length-1].equals("-") ) {
			throw new Exception("An underscore, period, or dash must be followed by one or more letter or number");
		}
		for (int i = 0; i < arStr.length; i++) {
			if(arStr[i].equals(" ")) {
				throw new Exception("Email addresses do not contain spaces");
			}
		}
		
		return email;
	}
	
}

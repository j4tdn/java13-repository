package ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Create a new Email");
		String email = null;
		do {
			try {
				System.out.print("Email:");
				email = ip.nextLine();
				CheckEmail(email);
				System.out.println("Created a new Email!!!");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Retype!!!!");
			}
		} while (true);

	}

	private static Boolean CheckEmail(String email) throws Exception {
		String regex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
	    if(email.matches(regex)) {
	    	return true;
	    } else {
	    	throw new Exception("Invalid");
	    }
	}
}
	
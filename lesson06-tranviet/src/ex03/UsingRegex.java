package ex03;

import java.util.Scanner;

public class UsingRegex {
	public static void main(String[] args) {
		String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
		String email = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input email: ");
			email = sc.nextLine();
			if(!email.matches(regex)) System.out.println("<INVALID EMAIL>");
		}
		while(!email.matches(regex));
		System.out.println("Email: " + email);
	}
}

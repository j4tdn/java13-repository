package ex02;

import java.util.Scanner;

public class App {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name = "";
		
		while(true) {
			try {
				System.out.println("Input your name: ");
				name = inputName();
				break;
			}catch(InvalidFormatNameException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Name after format");
		System.out.println(NameUtils.formatName(name));
	}
	
	private static String inputName() {
		String name = "";
		name = ip.nextLine();
		if (!NameUtils.isValidName(name)) 
			throw new InvalidFormatNameException("Name must have only characters (A-Z, a-z)");
		return name;
	}
}

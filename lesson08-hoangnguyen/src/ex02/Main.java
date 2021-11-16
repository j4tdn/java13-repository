package ex02;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Main {
	
	public static void main(String[] args) {
		try {
			String name = input();
			uppercaseFirstLetter(name);
		} catch (InputValidate e) {
			
			e.printStackTrace();
		}
		

	}
	
	private static void uppercaseFirstLetter(String str) {
		String result = "";
		for(String word : str.split("[\\s]+")) {
			result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
		}
		
		System.out.println(result);
	}
	
	private static String input() throws InputValidate {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		if(Pattern.matches("[a-zA-Z\\s]+", name)) {
			return name;
		} else {
			throw new InputValidate("Wrong type, try again");
		}
	}
}

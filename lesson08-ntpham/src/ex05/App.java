package ex05;

import java.util.Scanner;

public class App {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		while(true) {
			try {
				s1 = inputString("S1");
				s2 = inputString("S2");
				break;
			}catch(InvalidFormatStringException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.print("Longest Mutual Sub String : ");
		System.out.println(StringUtils.getLongestMutualSubString(s1, s2));
	}
	
	private static String inputString(String name) {
		String input = "";
		System.out.print("Input string " + name + " : ");
		input = ip.nextLine();
		if (input.length() >= 250) 
			throw new InvalidFormatStringException("Exceed lenght of string -> "
					+ "Length of input string must smaller 250");
		if (!isValidString(input)) 
			throw new InvalidFormatStringException(
					"Input's String must have only characters ['A'...'Z']");
		
		return input;
	}
	
	private static boolean isValidString(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(input.charAt(i)) || (!Character.isUpperCase(input.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}

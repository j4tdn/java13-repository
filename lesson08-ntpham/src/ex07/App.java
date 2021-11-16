package ex07;

import java.util.Scanner;

import ex05.InvalidFormatStringException;

public class App {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = "";
		while(true) {
			try {
				s = inputString();
				break;
			}catch(InvalidFormatStringException e) {
				System.out.println(e.getMessage());
			}
		}
		
		StringUtils.LongestSubCorrectString(s);

		StringUtils.SmallestSubCorrectString(s);
	}
	
	private static String inputString() {
		String input = "";
		System.out.print("Input string : ");
		input = ip.nextLine();
		if (input.length() >= 255) 
			throw new InvalidFormatStringException("Exceed lenght of string -> "
					+ "Length of input string must smaller 255");
		if (!isValidString(input)) 
			throw new InvalidFormatStringException(
					"Input's String must have only characters ['A'...'Z']");
		
		return input;
	}
	
	private static boolean isValidString(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isLetter(input.charAt(i)) || (!Character.isLowerCase(input.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}

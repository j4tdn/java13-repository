package ex03;

import java.util.Scanner;

public class App {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Input: ");
		String input = ip.nextLine();
		
		System.out.println("sadas: " + removeExtraSpaces(input)[1]);
		
		System.out.println("String after revert and remove extra space: " 
							+ revertAndRemoveExtraSpaces(input));
		
	}
	
	private static String[] removeExtraSpaces(String s) {
		String[] res = s.split("[\\s]+");
		return res;
	}
	
	private static String revertAndRemoveExtraSpaces(String s) {
		String[] res = removeExtraSpaces(s);
		String output = "";
		for (int i = 0; i < res.length; i++) {
			output += revert(res[i]) + " ";	
		}
		return output;
	}
	
	private static String revert(String s) {
		String rv = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rv += s.charAt(i);
		}
		return rv;
	}
}	

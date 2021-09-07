package homework;

import java.util.Scanner;

public class Ex03 {
	/**
	 * <b>Description:</b> Enter a number then check if it is Palindrome number or not then print the result<br>
	 */
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		Integer number = Integer.parseInt(ip.nextLine());
		
		if (isPalindromeNumber(number)) {
			System.out.println("The number " + number + " IS Palindrome Number");
		} else {
			System.out.println("The number " + number + " is NOT Palindrome Number");
		}
	}
	
	/**
	 * <b>Description:</b> Check if a number is Palindrome number or not<br>
	 * <b>Return:</b> True if the entered number is Palindrome number, otherwise, return False<br>
	 * @param number represent the input number
	 */
	public static boolean isPalindromeNumber (Integer number) {
		return number.toString().contentEquals(reverseString(number.toString()));
	}
	
	/**
	 * <b>Description:</b> This function to reverse a string<br>
	 * <b>Return:</b> The string after being reverse e.g. "CbA"<br>
	 * @param inputString represent the input string e.g. "AbC"
	 */
	public static String reverseString (String inputString) {
		byte[] inputStringToByteArray = inputString.getBytes();
		byte[] rereversedStringResult = new byte[inputString.length()];
		
		for (int i = 0; i < inputString.length(); i++) {
			rereversedStringResult[i] = inputStringToByteArray[inputStringToByteArray.length - i - 1];
		}
		return new String(rereversedStringResult);
	}
}

package TrungHoHomeWork;

import java.util.Scanner;

public class Ex03 {
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
	
	public static boolean isPalindromeNumber (Integer number) {
		return number.toString().contentEquals(reverseString(number.toString()));
	}
	
	public static String reverseString (String inputString) {
		byte[] inputStringToByteArray = inputString.getBytes();
		byte[] rereversedStringResult = new byte[inputString.length()];
		
		for (int i = 0; i < inputString.length(); i++) {
			rereversedStringResult[i] = inputStringToByteArray[inputStringToByteArray.length - i - 1];
		}
		
		return new String(rereversedStringResult);
	}
}

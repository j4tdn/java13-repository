package homework;

import java.util.Scanner;

public class Ex01 {
	/**
	 * <b>Description:</b> Enter a number then return if the entered number is power of 2 or not then return value<br>
	 */
	public static void main (String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = Integer.parseInt(ip.nextLine());
		
		if (isPowerOfTwo(number)) {
			System.out.println("The number " + number + " IS power of 2");
		} else {
			System.out.println("The number " + number + " is NOT power of 2");
		}	
	}
	
	/**
	 * <b>Description:</b> Check if an input number is power of 2 or not<br>
	 * <b>Return:</b> True if the entered number is power of 2, otherwise, return False<br>
	 * @param n represent the input number
	 */
	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
	 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        } 
        return true;
	}		
}

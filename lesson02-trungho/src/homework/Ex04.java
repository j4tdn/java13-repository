package homework;

import java.util.Scanner;

public class Ex04 {
	/**
	 * <b>Description:</b> Enter integer numbers from keyboards then return the max odd value from entered number<br>
	 */
	public static void main(String[] args) {
		int maxOddNumberValue = returnMaxOddNumber(takeArrayFromInput());
	}
	
	/**
	 * <b>Description:</b> This function to get the integer numbers from keyboards then save them in an array of int<br>
	 * <b>Return:</b> An array of int for the integer numbers from keyboards<br>
	 * @param null
	 */
	public static int[] takeArrayFromInput () {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want to store: ");
		Integer number = Integer.parseInt(ip.nextLine());
		
		int[] arrayOfInt = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the elements of the array: ");
			arrayOfInt[i] = Integer.parseInt(ip.nextLine());
		}
		return arrayOfInt;
	}
	
	/**
	 * <b>Description:</b> This function to return max odd number from input array of int<br>
	 * <b>Return:</b> The max odd number from input array of int<br>
	 * @param intArray represent the input array of int
	 */
	public static int returnMaxOddNumber(int intArray[]) {
		int maxOddNumber = -1;
		int firstOddNumberIndex = -1;
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] % 2 != 0) {
				maxOddNumber = intArray[i];
				firstOddNumberIndex = i;
				break;
			}
		}
		
		if (firstOddNumberIndex == -1) {
			System.out.println("There is no odd number!");
			return maxOddNumber;
		} else {
			for (int j = firstOddNumberIndex + 1; j < intArray.length; j++) {
				if (intArray[j] % 2 != 0 && (intArray[j] > maxOddNumber)) {
					maxOddNumber = intArray[j];
				}
			}
		}
		
		System.out.println("Max odd value: " + maxOddNumber);
		return maxOddNumber;
	}
}

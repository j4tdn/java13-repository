package ex02;

import java.util.Scanner;

public class App {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] inputStr = inputStrings(2);
		
		System.out.println("========================");
		
		System.out.println("Largest number: ");
		showLargestNumbers(getLargestNumber(inputStr));
	
		
	}
	
	private static int[] getLargestNumber(String[] inputStr) {
		int[] largestNumbers = new int[inputStr.length];
		for(int i = 0; i < inputStr.length; i++) {
			largestNumbers[i] = getLargestNumberIntoString(inputStr[i]);
		}
		return largestNumbers;
	}
	
	private static void showLargestNumbers(int[] largestNumbers) {
		for(int i = 0; i < largestNumbers.length; i++) {
			System.out.print(largestNumbers[i] + " ");
		}
	}
	
	private static String[] getListNumberStrIntoString(String string) {
		String[] listNumber = string.split("[a-z]+");
		return listNumber;
	}
	
	private static int[] listNumberStrToListNumberInt(String[] listNumberStr) {
		int[] listNumberInt = new int[listNumberStr.length];
		for (int i = 0; i < listNumberStr.length; i++) {
			if (listNumberStr[i] == "") listNumberInt[i] = 0;
			else {
				listNumberInt[i] = Integer.parseInt(listNumberStr[i]);
			}
		}
		return listNumberInt;
	}
	
	private static int getLargestNumberOfListNumberStr(String[] listNumberStr) {
		int[] listNumberInt = listNumberStrToListNumberInt(listNumberStr);
		int max = Integer.max(listNumberInt[0], listNumberInt[1]);
		for (int i = 2; i < listNumberInt.length; i++) {
			max = Integer.max(listNumberInt[i], max);
		}
		return max;
	}
	
	private static int getLargestNumberIntoString(String str) {
		String[] listNumberStr = getListNumberStrIntoString(str); 
		return getLargestNumberOfListNumberStr(listNumberStr);
	}
	
	private static String[] inputStrings(int n) {
		String[] inputStr = new String[n];
		for(int i = 0 ; i < n; i++) {
			System.out.print("String[" + i + "] : ");
			inputStr[i] = ip.nextLine();
		}
		return inputStr;
	}
}

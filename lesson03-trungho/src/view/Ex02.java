package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		printArrayInfo(getArrayInfo());
	}
	
	public static Integer[][] getArrayInfo () {
		Scanner ip = new Scanner(System.in);
		System.out.println("Please enter the number of row for the array: ");
		Integer row = Integer.parseInt(ip.nextLine());
		System.out.println("Please enter the number of column for the array: ");
		Integer column = Integer.parseInt(ip.nextLine());
		
		Integer[][] arrayOfNumber = new Integer[row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.println("Enter data for row " + (i + 1) + ", column " + (j + 1) + ":");
				arrayOfNumber[i][j] = Integer.parseInt(ip.nextLine());
			}
		}
		return arrayOfNumber;
	}
	
	public static void printArrayInfo (Integer[][] arrayOfNumber) {
		int row = arrayOfNumber.length;
		int column = arrayOfNumber[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				String value = String.format("%-5s", arrayOfNumber[i][j]);
				System.out.print(value);
			}
			System.out.println();
		}
	}
	
	// This function is not finished yet :(
	public static Object[][] getSaddleElement(Integer[][] arrayOfNumber){
		Integer[][] arrayOfSaddleElement = null;
		int row = arrayOfNumber.length;
		int column = arrayOfNumber[0].length;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				
			}
		}
		
		return arrayOfSaddleElement;
	}
	
	
	public static int getIndexOfMinValueOfARow(Integer[] numbers){
		int min = numbers[0];
		int index = 0;
		
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] < min){
				min = numbers[i];
				index = i;
		    }
		  }
		return index;
		}
	
	public static boolean isMaxValueOfAColumn(Integer[][] arrayOfNumber, int columnIndex, int rowIndex) {
		int row = arrayOfNumber.length;
		
		for(int i = 0; i < row; i++) {
			if(arrayOfNumber[i][columnIndex] > arrayOfNumber[rowIndex][columnIndex]) {
				return false;
			}
		}
		return true;
	}
	
	

}

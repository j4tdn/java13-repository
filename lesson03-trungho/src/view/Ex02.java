package view;

import java.util.Scanner;
/**
 * Bài 2: Viết chương trình nhập vào 1 mảng số nguyên A có kích thước MxN
 * Sau đó kiểm tra và in ra phần tử yên ngựa nếu có và vị trí của nó trong mảng
 * Nếu không có phần tử yên ngựa thì in ra không có phần tử yên ngựa
 */
public class Ex02 {
	public static void main(String[] args) {
		getSaddleElement(getArrayInfo());
	}
	
	/**
	 * Hàm này dùng để nhập 1 mảng số nguyên A có kích thước MxN từ bàn phím vào và lưu trữ nó
	 */
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
	
	/**
	 * Hàm này dùng để in ra các phần tử trong mảng số nguyên A có kích thước MxN
	 */
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
	
	/**
	 * Hàm này dùng để duyệt mảng số nguyên A có kích thước MxN
	 * Sau đó kiểm tra và in ra phần tử yên ngựa nếu có và vị trí của nó trong mảng
	 * Nếu không có phần tử yên ngựa thì in ra không có phần tử yên ngựa
	 */
	public static Integer getSaddleElement(Integer[][] arrayOfNumber){
		Integer saddleElement = null;
		int row = arrayOfNumber.length;
		
		for(int i = 0; i < row; i++) {
			int tempColumn = getIndexOfMinValueOfARow(arrayOfNumber[i]);
			
			if(isMaxValueOfAColumn(arrayOfNumber, tempColumn, i)) {
				saddleElement = arrayOfNumber[i][tempColumn];
				System.out.println("The saddle element is " + arrayOfNumber[i][tempColumn] + ". At row " + (i + 1) + " - column " + (tempColumn + 1) + " in the array that you input!");
				
				return saddleElement;
			}
		}
		
		System.out.println("There is no saddle element in the array that you input!");
		return saddleElement;
	}
	
	/**
	 * Hàm này dùng để lấy ra index của số nguyên nhỏ nhất trong 1 mảng
	 */
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
	
	/**
	 * Hàm này dùng kiểm tra một số tại địa chỉ (rowIndex, columnIndex) trong mảng 2 chiều A có phải là giá trị lớn nhất trong cột đang chứa nó hay không
	 */
	public static boolean isMaxValueOfAColumn(Integer[][] arrayOfNumber, int columnIndex, int rowIndex) {
		int row = arrayOfNumber.length;
		
		for(int i = 0; i < row; i++) {
			if((arrayOfNumber[i][columnIndex] >= arrayOfNumber[rowIndex][columnIndex]) && (i!= rowIndex)) {
				return false;
			}
		}
		return true;
	}
}

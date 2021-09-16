package ex02;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số hàng và số cột cho mảng: ");
		int row = Integer.parseInt(sc.nextLine());
		int column = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				arr[i][j] = new Random().nextInt(99) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		int count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(minRow(arr, i, column) == maxColumn(arr, row, j)) {
					System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]
										+ "\nLà phần tử yên ngựa");
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("Không có phần tử yên ngựa nào");
		}
	}
	
	
	public static int minRow(int[][] arr, int row, int column) {
		int min = arr[row][0];
		for (int i = 1; i < column; i++) {
			if(arr[row][i] < min) {
				min = arr[row][i];
			}
		}
		
		return min;
	}
	
	
	public static int maxColumn(int[][] arr, int row, int column) {
		int max = arr[0][column];
		for(int i = 1; i < row; i++) {
			if(arr[i][column] > max) {
				max = arr[i][column];
			}
		}
		
		return max;
	}
	
}

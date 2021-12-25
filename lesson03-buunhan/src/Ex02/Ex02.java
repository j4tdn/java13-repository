package Ex02;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert number of row and collum ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = new Random().nextInt(10) + 1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		} //display array
		
		int count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(minRow(arr, i, col) == maxColumn(arr, row, j)) {
					count++;
				}
			}
		} //count how many horse
		
		if(count == 0) {
			System.out.println("Mang k chua phan tu yen ngua");
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
	} //find min of a row
	
	
	public static int maxColumn(int[][] arr, int row, int column) {
		int max = arr[0][column];
		for(int i = 1; i < row; i++) {
			if(arr[i][column] > max) {
				max = arr[i][column];
			}
		}
		
		return max;
	} //find max of a collum
	
}
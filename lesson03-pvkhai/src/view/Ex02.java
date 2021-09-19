package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Nhập số hàng của bảng: ");
		int m = sc.nextInt();
		System.out.println("Nhập số cột của bảng: ");
		int n = sc.nextInt();
		int a[][] = new int[m][n];

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = rd.nextInt(99) + 1;
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		int count = 0;
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(minRow(a, i, n) == maxColum(a, m, j)) count ++;
			}
		}
		if(count > 0) System.out.println("Mảng a có " + count + " yên ngựa");
		else System.out.println("Mảng a không có yên ngựa nào");
	}	

	public static int minRow(int a[][],int m,int n) {

		int min = a[m][0];
		for(int j = 0;j<n; j++) {
			if(a[m][j] < min )  {
				min = a[m][j];
			}
		} 	
		return min;
	}
	
	public static int maxColum(int a[][], int m,int n) {
		
		int max = a[0][n];
		for(int i=0;i<m;i++) {
			if(a[i][n] > max) max = a[i][n];
		}
		return max;
	}
}
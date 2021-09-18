package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Random rd = new Random();
		int [][] a;
		System.out.println("Enter array size:");
		System.out.print("M = ");
		int m = kb.nextInt();
		System.out.print("N = ");
		int n = kb.nextInt();
		a = new int [m][n];
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++)  a[i][j] = rd.nextInt(99)+1;
		}
		
//		for(int i = 0; i< m; i++) {
//			for(int j =0; j < n; j++ ) {
//				System.out.print("a["+i+"]["+j+"]= ");
//				a[i][j] = kb.nextInt();
//			}
//		}
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++)  System.out.print(a[i][j]+"  ");
			System.out.println();
		}
		
		int [] minRow = new int[m]; // luu vi tri gia tri nho nhat cua hang
		int [] maxCol = new int[n]; // luu vi tri gia tri lon nhat cua cot
		
		// tim gia tri nho nhat cua cac hang
		
		for(int i = 0; i < m; i++) {
			minRow[i] = 0;
			int min = a[i][0];
			for(int j = 1; j< n; j++) 
				if(min > a[i][j]) {
					min = a[i][j];
					minRow[i] = j;
				}	
		}
		
		// tim gia tri lon nhat cua cac cot
		
		for(int j = 0; j< n; j++) {
			maxCol[j] = 0;
			int max = a[0][j];
			for(int i = 0; i < m; i++ ) 
				if(a[i][j]> max) {
					max = a[i][j];
					maxCol[j] = i;
				}			
		}
		
		// kiem tra neu vi tri nho nhat cua hang = vi tri lon nhat cua cot thi in gia tri
		System.out.print("Phan tu yen ngua: ");
		int dem = 0;
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++) {
				if( (i == maxCol[j]) && (j == minRow[i])) {
					System.out.println(a[i][j]);
					dem++;
				}
			}
		}
		if(dem == 0) System.out.println("Khong co phan tu nao");
		
		
	}		
	 
	
}

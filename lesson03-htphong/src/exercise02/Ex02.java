package exercise02;

import java.util.Random;
import java.util.Scanner;
//Bài 2: Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
//được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần
//tử lớn nhất trong cột của nó.
public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random rd = new Random();
		System.out.print("Nhap M: ");
		int M=input.nextInt();
		System.out.print("Nhap N: ");
		int N = input.nextInt();
		int [][] a = new int [M][N];
		//Nhap mang
		for(int i=0; i<M; i++) {
			for(int j=0; j<N;j++) {
				a[i][j]=1 + rd.nextInt(99);
			}
		}
		//Xuat mang
		for(int i=0; i<M; i++) {
			for(int j=0; j<N;j++) {
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		//Tim phan tu yen ngua
		int row=0;
		int minRow=0, maxCol=0;
		for(int i=0; i<M; i++) {
			minRow = a[i][0];
			for(int j=0; j<N;j++) {
				if(a[i][j]<minRow) {
					minRow=a[i][j];
					row=j;
				}
			}
			maxCol=a[0][row];
			for(int j=0; j<M;j++) {
				if(a[j][row]>maxCol) maxCol=a[j][row];
			}
			
			if(maxCol==minRow) {
				System.out.println(minRow+" la phan tu yen ngua!");
				return;
			}
		}
		System.out.println("Khong co");
		
	}
}

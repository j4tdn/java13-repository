package Ex02;

import java.util.Scanner;

/*
 Bài 2: Phần tử yên ngựa
Cho bảng A kích thước MxN. Các phần tử của mảng là các số ngẫu nhiên [1-99]. Phần tử Aij
được gọi là phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần
tử lớn nhất trong cột của nó.
47 47 36
23 43 31
46 7 29
Theo ví dụ trong bảng số sau đây thì phần tử A02 chính là phần tử yên ngựa.
Bạn hãy lập chương trình nhập từ bàn phím một bảng số kích thước MxN và kiểm tra xem nó có
phần tử yên ngựa hay không?
 */
public class Saddle {
	static int row, col;
	public static void main(String[] args) {
		int arr[][] = new int[99][99];
		Input(arr);
		System.out.println();
		show(arr);
		System.out.println();
		checkSaddle(arr);
	}
	
	public static void Input(int arr[][]) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number row is: ");
		row = ip.nextInt();
		System.out.println("Enter number column is: ");
		col = ip.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter Element [" + i + ";" + j + "] = ");
				arr[i][j] = ip.nextInt();
			}
		}
	}
	
	public static void show(int arr[][]) {
		System.out.println("Display the matrix: ");
		for (int i = 0; i < row ; i ++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%6d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void checkSaddle(int arr[][]) {
		int minRow[] = new int[99];
		int maxCol[] = new int[99];
		for (int i = 0; i < row; i++) {
			minRow[i] = arr[i][0];
			for (int j = 0; j < col; j++) {
				if (minRow[i] > arr[i][j]) {
					 minRow[i] = arr[i][j];
				}
			}
		}
		
		for (int j = 0; j < col; j++) {
			maxCol[j] = arr[0][j];
			for(int i = 0; i < row; i++) {
				if (maxCol[j] < arr[i][j]) {
					maxCol[j] = arr[i][j];
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(minRow[i] == maxCol[j]) 
					System.out.println("Saddle arr[" + i + "][" + j +"]=" + arr[i][j]);
				else
					System.out.println("No Saddle Element!!");
				}	
			}
		}
	}



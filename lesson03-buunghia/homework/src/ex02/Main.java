package ex02;
import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input array height:");
		int m=Validation.checkInputInt();
		System.out.print("Input array width:");
		int n=Validation.checkInputInt();
		int[][] arr = new int[m][n];
		rndArray(arr,m,n);
		displayArray(arr,m,n);
		n=diemYenNgua(arr,m,n);
		if (n!=-1) 
			System.out.print(n+" la diem yen ngua");
		
		else
			System.out.print("Khong co diem yen ngua");
	}
	public static void rndArray(int[][] arr,int height,int width) {
		Random rd= new Random();
		for (int i=0;i<height;i++) {
			for (int j=0;j<width;j++) {
				arr[i][j]=1+rd.nextInt(99);
			}
		}
	}
	public static void displayArray(int[][] arr,int height,int width) {
		for (int i=0;i<height;i++) {
			for (int j=0;j<width;j++) 
				System.out.print(String.format("%-5d",arr[i][j]));
			System.out.print("\n");
		}
	}
	public static int rowMin(int[][] arr,int width,int row) {
		int s=arr[row][0];
		for (int i=0;i<width;i++) {
			if (arr[row][i]<s) s=arr[row][i];
		}
		return s;
	}
	public static int collumMax(int[][] arr,int height,int collum) {
		int l=arr[0][collum];
		for (int j=0;j<height;j++) {
			if (arr[j][collum]>l) l=arr[j][collum];
		}
		return l;
	}
	public static int diemYenNgua(int[][] arr,int height,int width) {
		for (int i=0;i<height;i++) {
			int s=rowMin(arr,width,i);
			for (int j=0;j<width;j++)
				if (s==collumMax(arr,height,j)) return s;
		}
		return -1;
	}
}


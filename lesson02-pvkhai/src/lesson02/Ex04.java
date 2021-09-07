package lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap cac gia tri: ");
		for(int i = 0;i < n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Max(a));
	}
	
	private static int Max(int[] a) {
		
		int max = 0;
		for(int i = 0 ;i < a.length ;i++) {
			if( a[i] % 2 == 1 && a[i] > a[max]) {
				a[max] = a[i];
			}
		}
		return a[max];
	}
}

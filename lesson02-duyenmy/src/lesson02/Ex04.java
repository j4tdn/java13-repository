package lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "Nhap so luong phan tu can kiem tra");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int b= 0;
		for(int i=0;i<n;i++) {
			if(kt(a[i])) {
				if(a [i]> b )
					b=a[i];
			}
		}
		System.out.println(b);
	}
	public static boolean kt(int a) {
		if(a%2==0) 
			return false;
		return true;
	}
}

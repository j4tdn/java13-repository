package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert n: ");
        n = sc.nextInt();
        
        a = new int[n];
        nhap(a,n);
        MaxOdd(a,n);
        System.out.println("MaxOdd is " + MaxOdd(a,n));
		
	}
	public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
    }
	public static int MaxOdd(int a[],int n) {
		int MaxOdd = 1;
		int i;
		for ( i =0; i < a.length ; i ++) {
			int k = a[i];
			if (k % 2 !=0 && k >= MaxOdd) {
				MaxOdd = k;
			}
		}
		return MaxOdd;
	}
	
}

package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int n = ip.nextInt();
		int[] a= new int[10];
		int i=0;
		while (n!=0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}
}


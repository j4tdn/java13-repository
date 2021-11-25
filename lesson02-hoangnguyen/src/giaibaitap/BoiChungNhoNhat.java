package giaibaitap;

import java.util.Random;
import java.util.Scanner;

public class BoiChungNhoNhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Input n: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n == 0);
		
		System.out.println(getLeastCommonMultiple(n));
	}

	public static int getLeastCommonMultiple(int n) {
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = new Random().nextInt(10) + 1;
			System.out.println("a[" + i + "] = " + a[i] );
		}
		
		int temp = BCNN(a[0], a[1]);
		for(int i = 2; i < n; i++) {
			temp = BCNN(temp, a[i]);
		}
		
		return temp;
	}
	
	public static int BCNN(int a, int b) {
		return (a * b / UCLN(a, b));
	}
	
	public static int UCLN(int a, int b) {
		if(a == b) return a;
		if(a > b) {
			return UCLN(a - b, b);
		} else {
			return UCLN(a, b - a);
		}
	}
}

package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Nhap a");
		a = sc.nextInt();
		check(a);
		
	}
	
	public static void check(int n) {
		while (n>=2 && (n % 2 ==0)) {
			n = n / 2;
		}
		if (n == 1) {
			System.out.println("A la luy thuy cua 2");
		}
		else {
			System.out.println("A khong phai luy thua cua 2");
		}
	}
}

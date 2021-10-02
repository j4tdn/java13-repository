package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		check(8,2);
		check(2,2);
		check(2,8);
		check(14,3);
		
		}
	private static void check (Integer x, Integer y ) {
		int a,b = 0;
		
		if (x>y) {
			a=x;
			b=y;
		}else {
			a=y;
			b=x;
		}
		
		Integer k=a;
		while (a >= b) {
			if (a%b == 0) {
				a = a/b;
			} else {
				System.out.println(k + " khong phai la luy thua cua " +b+ " !");
				break;
			}
		}
		if (a==1) {
			System.out.println(k + " la luy thua cua " +b+ " !");
		}
	}
}

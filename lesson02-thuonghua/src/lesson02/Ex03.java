package lesson02;

import java.util.Scanner;

public class Ex03 {
		public static void main(String[] args) {
		
			Scanner ip = new Scanner(System.in);
			System.out.print("Nhap so can kiem tra: ");
			int c = ip.nextInt();
			
			reverse(c);
			
		}
		
		private static void reverse(int c) {
			int a = 0, b = 0;
			int h = c;
			while(c != 0) {
				a = c % 10;
				b = b*10 + a;
				c = c /10;
			}
			
			if(b == h) {
				System.out.println(h + " la so doi xung");
			} else {
				System.out.println(h + " khong phai la so doi xung");
			}
		}
}
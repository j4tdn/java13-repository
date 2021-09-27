package ex02;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int[] arr = new int[n];
		System.out.println("Mảng nhập ban đầu: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(99)+1;
			System.out.print( "["+arr[i]+"]");
			
		}
	}
}
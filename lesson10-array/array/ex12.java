package array;

import java.util.Random;
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng : ");
		int n = Integer.parseInt(ip.nextLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Random().nextInt(99) + 1;
			System.out.print(arr[i] + "\t");

		}
		System.out.println("\nMảng chia hết cho 5: ");
		for(int i = 0;i < n;i++) {
			if(arr[i] % 5 == 0) {
				System.out.print(arr[i] + "\t");
			}
		}
	}
}
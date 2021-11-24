package array;

import java.util.Random;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập độ dài mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		
		for (int i = 0; i < n;i++) {
			arr[i] = new Random().nextInt(99) + 1;
			System.out.print(arr[i] + "\t");
		}
		for (int j = 0;j < n/2;j++) {
			int temp = arr[j];
			arr[j] = arr[n - 1 - j];
			arr[n - 1 - j] = temp;
		}
		
		System.out.println("\nMảng đổi chiều:");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}

	}
}

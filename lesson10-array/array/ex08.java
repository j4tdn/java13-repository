package array;

import java.util.Random;
import java.util.Scanner;

/*Tìm và in ra màn hình số lượng số nguyên lẻ, 
 * số lượng số nguyên chẵn trong mảng.
 * 
 */
public class ex08 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng : ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		for (int i = 0; i < n;i++) {
			arr[i] = new Random().nextInt(99)+1;
			System.out.print(arr[i] + "\t");
		}	
		evenOddArr(arr);
	}
	private static void evenOddArr(int [] arr) {
		for (int digit : arr) {
			if (digit % 2 == 0) {
				System.out.print("\nSố chẵn trong mảng :" + digit);
			}if (digit % 2 != 0) {
			System.out.print("\nSố lẻ trong mảng :" + digit);
			}
		}
	}
}

package array;

import java.util.Random;
import java.util.Scanner;

/*
 * Tách một nửa đầu của mảng ban đầu sang mảng thứ nhất 
 * và nửa còn lại sang mảng thứ hai.
 */
public class ex11 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		int [] arrOne = new int[n];
		int [] arrTwo = new int[n];
		System.out.println("\nMảng ban đầu: ");
		for(int i = 0; i <n;i++) {
			arr[i] = new Random().nextInt(19)+1;
			System.out.print(arr[i] + "\t");
		}
		int o = 0;
		int t = 0;
		
		for(int i = 0; i < n/2;i++) {
			arrOne[o] = arr[i];
			o++;
		}
		for (int i = n/2 ;i < n;i++) {
			arrTwo[t] = arr[i];
			t++;
		}
		System.out.println("\nMảng thứ nhất : ");
		for (int i = 0;i < o;i++) {
			System.out.print(arrOne[i] + "\t");
		}
		System.out.println("\nMảng thứ hai : ");
		for (int i = 0;i < t;i++) {
			System.out.print(arrTwo[i] + "\t");
		}
	}
}

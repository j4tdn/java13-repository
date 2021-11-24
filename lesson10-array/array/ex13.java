package array;

import java.util.Random;
import java.util.Scanner;

/*Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím.
 * 
 */
public class ex13 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int [n];
		for (int i = 0;i < n; i++) {
			arr[i] = new Random().nextInt(19)+1;
			System.out.print(arr[i] + "\t");
		}
		int count = 0;
		System.out.print("\nNhập số : ");
		int number = Integer.parseInt(ip.nextLine());
		
		for(int i = 0;i < n;i++) {
			if(arr[i] == number) {
				count++;
			}
			
		}System.out.println("Số : " + number + " xuất hiện " + count + " trong mảng");
		
		
	}
}

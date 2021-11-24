package array;

import java.util.Random;
import java.util.Scanner;

/*Xóa phần tử có giá trị k trong mảng (k nhập từ bàn phím)
 * 
 */
public class ex09 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng : ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int [n];
		for(int i = 0;i < n; i++) {
			arr[i] = new Random().nextInt(99)+1;
			System.out.print(arr[i]+ "\t");
			
		}
		System.out.print("\nNhập số k : ");
		int k = Integer.parseInt(ip.nextLine());
		int i,j;
		for(i = j = 0;i < n;i++) {
		if(arr[i] != k) {
			arr[j] = arr[i];
			j++;
		}
		}
		n = j;
		System.out.println("Mảng sau khi xóa số " + k + " là :");
		for(i = 0; i< n;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}

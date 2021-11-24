package array;

import java.util.Random;
import java.util.Scanner;

/*Viết chương trình thực hiện các công việc sau:

Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím.
Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng.
In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
Yêu cầu kỹ thuật: Chương trình phải kiểm tra n nhập vào (n >= 2 và n <= max - 1,
 với max là số phần tử tối đa của mảng).
 * 
 */
public class ex01 {
	public static void main(String[] args) {
		int temp;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Random().nextInt(99)+1;
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < n - 1;i++) {
			for (int j = i + 1; j <= n -1;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nMảng sắp xếp : ");
		for (int i = 0; i < n; i++) {
			
			System.out.print(arr[i]+ "\t");
		}
	}
}

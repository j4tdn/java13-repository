package array;

import java.util.Random;
import java.util.Scanner;

/*
 * Viết chương trình thực hiện các công việc sau:

Nhập liệu cho mảng có n phần tử nguyên (n > 0) từ bàn phím.
Nhập số nguyên k từ bàn phím. 
Tìm kiếm phần tử đầu tiên trong mảng có giá trị bằng k và thông báo lên màn hình
 vị trí của phần tử đó. Nếu không có phần tử nào của mảng có giá trị bằng k 
 thì thông báo "Trong mảng không có phần tử nào chứa giá trị cần tìm."
 */
public class ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Random().nextInt(100);
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\nNhập số k: ");
		int k = Integer.parseInt(ip.nextLine());
		int j = 0;
		while((j < n)  && (arr[j] != k)) {
			j++;
		}
		if (j > n - 1) {
			System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm");
		}
			System.out.println("Số k: " + k + " nằm ở vị trí thứ: " + j);	
			
		}
		
	
}

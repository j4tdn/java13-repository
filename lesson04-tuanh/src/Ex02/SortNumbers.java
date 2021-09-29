package Ex02;

/**
 * Bài 2: CHo một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
 * Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. 
 * Các số vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
 * Input: 12,21,25,19,32,35,49,10,33,14,18
 * Output: 21,49,14,12,19,32,35,33,18,25,10
 */

import java.util.Random;
import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = ip.nextInt();
		int Array[] = new int[n];
		for (int i = 0; i < n ; i++)
		{
			Random rd = new Random();
			Array[i] = rd.nextInt(100) + 1;
			System.out.print(Array[i] + " ");
		}		
		System.out.println("\n List array sorted: ");
		Sort(Array, n);
	}
	
	private static void Sort(int[] Array, int n) {
		int temp = 0;
		for(int k = 0; k < n; k++) {
			if(Array[k] % 7 != 0) {
				for(int i = k ; i < n-1; i++) {
					for(int j = i + 1; j < n; j++) {
						if(Array[j] % 7 == 0 && Array[j] % 5 != 0) {
							temp = Array[j];
							Array[j] = Array[i];
							Array[i] = temp;
						}
					}
				}
			}
		}
		
		for(int k = n - 1; k > 0; k--) {
			if(Array[k] % 5 !=0 ) {
				for(int i = n - 1; i > 0; i--) {
					for(int j = i -1; j > 0; j--) {
						if(Array[j] % 5 == 0 && Array[j] % 7 != 0) {
							temp = Array[j];
							Array[j] = Array[i];
							Array[i] = temp;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(Array[i] + " ");
		}
		
	}
}

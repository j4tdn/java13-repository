package array;

import java.util.Random;
import java.util.Scanner;

/*Nhập mảng và thực hiện tách các số chẵn và lẻ trong mảng sang hai mảng khác.
 * 
 */
public class ex10 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập số lượng mảng: ");
		int n = Integer.parseInt(ip.nextLine());
		int [] arr = new int[n];
		int [] even = new int[n];
		int [] odd = new int[n];
		System.out.println("\nMảng ban đầu: ");
		for(int i = 0; i <n;i++) {
			arr[i] = new Random().nextInt(19)+1;
			System.out.print(arr[i] + "\t");
			
		}
		int c = 0;
		int l = 0;
		
		for (int i = 0; i < n;i++) {
			if(arr[i] % 2 == 0) {
				even[c] = arr[i];
				c++;
			}else {
				odd[l] = arr[i];
				l++;
			}
		}
		System.out.println("\nMảng chứa số chẵn : ");
		for(int i = 0;i < c; i++) {
			System.out.print(even[i] + "\t");
		}
		System.out.println("\nMảng chứa số lẻ : ");
		for(int i = 0;i < l; i++) {
			System.out.print(odd[i] + "\t");
		}
	}
}

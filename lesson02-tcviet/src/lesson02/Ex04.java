package lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the number of elements: ");
		int numberOfElements = sc.nextInt();
		int[] arr = new int[numberOfElements];
		for(int i = 0; i<numberOfElements; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		int varCheck = 0;
		for(int i = 0; i<numberOfElements; i++) {
			if(arr[i] % 2 != 0 && arr[i] > varCheck) {
				varCheck = arr[i];
			}
		}
		System.out.println("So le lon nhat trong mang la: " + varCheck);
		sc.close();
	}
}

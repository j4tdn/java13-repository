package view;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner input = new Scanner(System.in);
		System.out.print("input number of array: ");
		int n = input.nextInt();
		int[] array = new int[n];
		array[0] = 20 + rd.nextInt(30 - 20 + 1);
		for(int i=1;i<n;i++) {
			array[i] = 20 + rd.nextInt(30 - 20 + 1);
			int k=0;
			do {
				k=0;
				for(int j=0;j<i;j++) {
					if(array[i]==array[j]) {
						k++;
					}
				}
				if(k!=0) {
					array[i] = 20 + rd.nextInt(30 - 20 + 1);
				}
			}while(k!=0);
			
		}
		System.out.println(n+ " numbers: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
}

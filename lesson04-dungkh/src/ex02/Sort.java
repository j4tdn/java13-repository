package ex02;

import java.util.Random;
import java.util.Scanner;

public class Sort {		
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.print("Input elements of array: ");
			int n = ip.nextInt();
			int array[] = new int[n];
			System.out.println("Original Array: ");
			for (int i = 0; i < n ; i++)
			{
				Random rd = new Random();
				array[i] = rd.nextInt(); 
				//array[i] = rd.nextInt(30) + 1;
				System.out.print(array[i] + " ");
			}		
			System.out.println("\nSorted Array: ");
			Sorted(array,n);
			
			
		}	
		public static void Sorted(int[] array,int n) {
			int start = 0;
			for(int i = 0; i < n; i++) {
				if(array[i] % 7 == 0 && array[i] % 5 != 0) {
					int temp = array[start];
					array[start] = array[i];
					array[i] = temp;
					start++;
				}
			}
			int end = n - 1;
			for(int i = n - 1; i >= 0; i--) {
				if(array[i] % 5 == 0 && array[i] % 7 != 0) {
					int temp = array[end];
					array[end] = array[i];
					array[i] = temp;
					end--;
				}
			}
			for(int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}
		}
}
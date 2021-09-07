package exercises;

import java.util.Scanner;

public class Ex04 {
	
	
	public static void main(String[] args) {
		int[] numbers = new int[30];
		
		System.out.print("Nhap so phan tu: ");
		
		int numberElements = new Scanner(System.in).nextInt();
		
		importArray(numbers, numberElements);
		int max = numbers[0];
		for(int i = 0; i < 5; i++) {
			if(numbers[i] %2 != 0 && numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("So le lon nhat = "+ max);
	}
	
	public static void importArray(int [] numbers, int numberElements) {
		Scanner ip = new Scanner(System.in);
		for(int i = 0; i < numberElements; i++) {
			System.out.print("Nhap array["+ i + "]: ");
			numbers[i] = ip.nextInt();
		}
	}
}

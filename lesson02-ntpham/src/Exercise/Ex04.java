package Exercise;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = input.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("nbr[" + i + "] = ");
			numbers[i] = input.nextInt();
		}
		System.out.println("Max odd number in array: " + findMaxOddNumberInArray(numbers));
	}
	
	public static int findMaxOddNumberInArray(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if((array[i] % 2 == 1) && array[i] > max) max = array[i];
		}
		return max;
	}
}

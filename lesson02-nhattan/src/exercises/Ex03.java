package exercises;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		System.out.print("Nhap vao mot so bat ki: ");
		
		int number = new Scanner(System.in).nextInt();
		
		if(isSymmetryNumbers(number)) {
			System.out.println(number + " la so doi xung");
		} else {
			System.out.println(number + " khong phai la so doi xung");
		}
	}
	
	public static boolean isSymmetryNumbers(int input) {

		int temp = input;
		int sum = 0;
		while(input > 0) {
			sum = input % 10 + sum * 10;
			input /= 10;
		}
		if(sum == temp) {
			return true;
		}
		return false;
	}
}

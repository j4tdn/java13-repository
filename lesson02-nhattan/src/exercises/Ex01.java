package exercises;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.print("Nhap vao mot so tu nhien: ");
		int number = new Scanner(System.in).nextInt();
		
		if(isSquareOfTwo(number)) {
			System.out.println(number + " la luy thua cua 2");
		} else {
			System.out.println(number + " khong phai la luy thua cua 2");
		}
	}
	
	public static boolean isSquareOfTwo(int input) {
		if(input < 1) {
			return false;
		}
		while(input > 1) {
			if(!(input % 2 == 0)) {
				return false;
			}
			input = input/2;
		}
		return true;
	}
}

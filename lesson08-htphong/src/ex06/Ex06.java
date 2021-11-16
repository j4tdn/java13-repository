package ex06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap vi tri: ");
		int k = ip.nextInt();
		System.out.println("Vi tri thu "+ k+" : " + findNumberPositionAt(k));
	}
	
	private static int findNumberPositionAt(int pos) {
		String number = "";
		for(int i = 1;number.length()<pos;i++) {
			number+=i;
		}
		
		return Integer.parseInt(String.valueOf((number.charAt(pos-1))));
	}
}

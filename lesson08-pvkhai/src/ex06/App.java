package ex06;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pos: ");
		int pos = sc.nextInt();
		System.out.println("Pos " + pos + ": " + findNumber(pos));
	}
	
	public static int findNumber(int pos) {
		String s = "";
		for(int i = 1; i <= pos; i++) {
			s += i;
		}
		return Integer.parseInt(String.valueOf((s.charAt(pos-1))));
	}
}

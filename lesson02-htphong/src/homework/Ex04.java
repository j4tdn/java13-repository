package homework;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		maxOdd();
	}
	public static void maxOdd() {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number (0 to stop): ");
		int a = input.nextInt();
		int max=a;
		do {
			System.out.print("Enter a number (0 to stop): ");
			a=input.nextInt();
			if(a%2!=0) {
				if(a>max) max=a;
			}
		}while(a!=0);
		System.out.println("Max odd: "+max);
	}
}

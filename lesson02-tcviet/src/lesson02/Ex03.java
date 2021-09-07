package lesson02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = sc.nextInt();
		if (isSymmetricalNumber(number)){
			System.out.println(number + " la so doi xung");	
		}
		else {
			System.out.println(number + " khong la so doi xung");
		}
		sc.close();
		
	}
	public static boolean isSymmetricalNumber(int number) {
		int saveNumber = number;
		int checkNumber = 0;
		do {
			checkNumber*=10;
			checkNumber += number % 10;				
			number/=10;	
		}
		while(number > 0);
		if(checkNumber == saveNumber) {
			return true;
		}
		else return false;
		
	}
}	

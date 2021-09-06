package homework;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		primeNumber();
	}
	public static boolean checkPrime(int a) {
		int k=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) k++;
		}
		if(k==2) return true;
		else return false;
	}
	public static void primeNumber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Position of prime number: ");
		int x=input.nextInt();
		int i=0;
		int k=0;
		while(i!=x) {
			k++;
			if(checkPrime(k)) i++;
		}
		System.out.println("value = "+k);
	}
}

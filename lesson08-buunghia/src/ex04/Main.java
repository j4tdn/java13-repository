package ex04;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter b");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println(a+" and "+b+" is "+isEquivalentPrime(a,b)+"equivalent prime.");
	}
	public static boolean isPrimeNumber(int a) {
		for (int i=2;i<=a/2;i++)
			if (a % i ==0) return false;
		return true;
	}
	public static String isEquivalentPrime(int a,int b) {
		int max;
		if (a == b) return "";
		if (a > b) 
			max = a;
		else
			max = b;
		for (int i = 2 ;i <= max / 2; i++) {
			if (isPrimeNumber(i)) {
				if((a % i ==0) != (b % i ==0))
					return "not ";
			}
		}
		return "";
	}
}

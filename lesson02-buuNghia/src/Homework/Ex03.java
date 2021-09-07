package Homework;
import java.util.Scanner;
public class Ex03 {
	public  static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Input an integer:n=");
		int n =sc.nextInt();
		System.out.print(n+" is" + isPalindrome(n) +"a palindrome number");
		
	}
	private static String isPalindrome(int n) {
		int a=n,b=0;
		while (n!=0) {
			b=10*b+n%10;
			n/=10;
		}
		if (a==b) return " ";
		else return " not ";
	}
}

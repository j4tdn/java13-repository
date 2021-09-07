package Homework;
import java.util.Scanner;
public class Ex01 {
	public  static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input an integer:n=");
		int n=sc.nextInt();
		System.out.print(n+" is"+ isPowerOf2(n) + "a power of 2.");
	
	}
	private static String isPowerOf2(int n) {
		if (n==0) return " not ";
		if (n==1) return " ";
		if (n%2==0) return isPowerOf2(n/2);
		else return " not ";
	}
}

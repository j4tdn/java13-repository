package homework;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		checkSymNumber();
	}
	public static boolean symNumber(int a) {
		int b=a;
		int s=0;
		while(b!=0) {
			int du=b%10;
			s=s*10+du;
			b/=10;
		}
		if(s==a) return true;
		else return false;
	}
	public static void checkSymNumber() {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=input.nextInt();
		if(symNumber(a)) System.out.println(a+ " is a symmetrical number");
		else System.out.println(a+ " is not a symmetrical number");
	}
}

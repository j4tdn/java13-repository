package ex01;
import java.util.Scanner;
public class Validation {
	private static Scanner sc=new Scanner(System.in);
	public static int checkInputInt() {
		while(true) {
			try {
				int n=Integer.parseInt(sc.nextLine());
				if(n<=0)
					System.out.print("Please input a positive number:");
				else
					return n;
			}catch(NumberFormatException e) {
				System.err.println("Please input a number");
				System.out.print("Enter again:");
			}
		}
	}
	public static int checkInputInt(int min,int max) {
		while(true) {
			try {
				int n=Integer.parseInt(sc.nextLine());
				if(n<min||n>max)
					throw new NumberFormatException();
				return n;
			}catch(NumberFormatException e) {
				System.err.println("Please input number in range ["+min+","+max+"]");
				System.out.print("Enter again:");
			}
		}
	}
}

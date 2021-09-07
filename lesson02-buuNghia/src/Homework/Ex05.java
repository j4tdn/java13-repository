package Homework;
import java.util.Scanner;
public class Ex05 {
	public  static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Input an integer:n=");
		int n = sc.nextInt();
		System.out.print(n+"convert to binary is:");
		convertToBinary(n);
	}
	private static void convertToBinary(int n) {
		if (n>=2) convertToBinary(n/2);
		System.out.print(n%2);
	}
}

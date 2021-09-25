import java.util.Random;
import java.util.Scanner;

public class Ex04Fix {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = Integer.parseInt(ip.nextLine());
		int[] digits = new int[number];
		Random rd = new Random();
		int i = 0;
		while (i < digits.length) {
			digits[i] = rd.nextInt(100);
			System.out.print("[" + digits[i] + "]");
			i++;
			
		}
		int max = Integer.MIN_VALUE;
		int n = 0;
		while (n < digits.length) {
			if(digits[n] %2 != 0 && digits[n] > max) {
				max = digits[n];
			}n++;
		}
		System.out.println("\n[" + max + "]" + " la so le lon nhat ");
	}
}

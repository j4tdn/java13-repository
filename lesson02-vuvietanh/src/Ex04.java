import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = Integer.parseInt(ip.nextLine());
		int[] digits = new int[number];
		Random rd = new Random();
		int i = 0;
		while (i < digits.length) {
			digits[i] = rd.nextInt(100);
			System.out.println("[" + digits[i] + "]");
			i++;
		}
		int maxODD = digits[0];
		for (i = 0; i < digits.length - 1; i++) {
			if (digits[i + 1] % 2 == 1) {
				if (digits[i + 1] > maxODD) {
					maxODD = digits[i + 1];
				}
			}
		}
		System.out.println(maxODD + ": la so le lon nhat");
	}
}

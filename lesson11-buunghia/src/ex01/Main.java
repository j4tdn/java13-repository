package ex01;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter an integer:");
				a = Integer.parseInt(sc.nextLine());
				break;
			}catch(NumberFormatException e) {
				
			}
		}
		for (int i = 1; i <= 2 * a - 1; i++) {
			int k = i;
			if (k > a) k = 2 * a -k;
			for (int j = 1; j <= 2 * a - 1; j++) {
				if (j <= k || j >= 2 * a -k)
					System.out.print(String.format("%-3d ",j ));
				else
					System.out.print("    ");
			}
			System.out.println();
		}
	}
}

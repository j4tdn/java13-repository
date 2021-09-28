package ex03;
/**
 * Viết chương trình in ra màn hình tam giác Pascal.
 * * @author PhoIndie
 */
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		input.close();
		
		drawTrianglePascal(n);
	}
	
	public static void drawTrianglePascal(int n) {
		System.out.println("Triangle pascal: ");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%-3d",elementTrianglePascal(i, j));
			}
			System.out.println("");
		}
	}
	
	public static int elementTrianglePascal(int n, int i) {
		if (i == 0 || i == n) return 1;
		else return elementTrianglePascal(n - 1, i) + elementTrianglePascal(n - 1, i - 1);
	}
}

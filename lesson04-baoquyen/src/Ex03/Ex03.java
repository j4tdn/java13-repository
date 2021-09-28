package Ex03;
/*
 * Bài 3: Viết chương trình in ra màn hình tam giác Pascal. Ví dụ, với n=4 sẽ in ra hình sau:
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 
 */
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n ;
		while(true) {
			System.out.print("Enter n: ");
			n = ip.nextInt();
			if (n > 0) break;
		}
		
		int [][] a = new int[n+2][n+2];
		for(int i = 1; i <= n + 1; i++ ) {
			for(int j = 0; j <= i; j++) {
				if( j == 0 || j == i) {
					a[i][j] = 1;
					System.out.print(a[i][j]+ "\t");
				}
				else {
					a[i][j] = a[i-1][j-1] + a[i-1][j];
					System.out.print(a[i][j]+ "\t");
				}
				
			}
		System.out.println();	
		}
	}
}

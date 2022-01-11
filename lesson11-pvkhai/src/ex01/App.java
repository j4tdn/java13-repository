package ex01;

public class App {
	public static void main(String[] args) {
		print(4);
	}
	
	private static void print(int n) {
		for(int i = 1; i <= 2*n - 1; i++) {
			for(int j = 1; j <= 2*n - 1; j++) {
				if(j <= i && j <= 2*n - i) System.out.print(j);
				else if(j >=i && j >= 2*n-i) System.out.print(j);
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}

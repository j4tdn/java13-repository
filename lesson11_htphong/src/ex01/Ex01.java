package ex01;

public class Ex01 {
	public static void main(String[] args) {
		print(7);
	}
	private static void print(int n) {
		int point = (int)Math.ceil((double)n/2);
		for(int i = 1; i <= point; i++) {
			for(int j = 1; j<=i; j++) {
				if(j!=point) {
					System.out.print(j+" ");
				}
			}
			for(int j = 1; j<=n-i*2; j++) {
				System.out.print("  ");
			}
			for(int j = n - i + 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i = point-1; i >= 1; i--) {
			for(int j = 1; j<=i; j++) {
				if(j!=point) {
					System.out.print(j+" ");
				}
			}
			for(int j = 1; j<=n-i*2; j++) {
				System.out.print("  ");
			}
			for(int j = n - i + 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

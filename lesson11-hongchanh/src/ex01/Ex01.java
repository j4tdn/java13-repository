package ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {

		int p = 0;
		while (true) {
			System.out.print("nhap: ");
			try {
				p = enterP();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
		print(p);
	}

	public static int enterP() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		if (p%2 == 0) {
			throw new Exception("nhap so co dang 2n-1");
		}
		return p;
	}
	
	private static void print(int n) {
		
		int mid = (int)Math.ceil((double)n/2) -1;
		
		for(int i=0; i<n ; i++) {
			for (int t=0; t<n ; t++) {
				if(Math.abs(t-mid) >= Math.abs(mid-i)) {
					System.out.print(t+1 + " ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
}

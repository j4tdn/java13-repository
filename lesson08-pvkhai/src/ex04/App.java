package ex04;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		int[] d1 = divisor(15);
		ArrayList<Integer> p1 = prime(d1);
		
		int[] d2 = divisor(75);
		ArrayList<Integer> p2 = prime(d2);
		
		if(p1.equals(p2)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
	public static int[] divisor(int m) {
		int[] divisor = new int[m];
		int count = 0;
		for(int i = 1; i <= m; i++) {
			if(m % i == 0) {
				divisor[count] = i;
				count++;
			}
		}
		return divisor;
	}
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	
	public static ArrayList<Integer> prime(int[] d) {
		ArrayList<Integer> listPrimeDivisor = new ArrayList<Integer>();
		
		for(int i = 0; i < d.length; i++) {
			if(isPrime(d[i])) {
				listPrimeDivisor.add(d[i]);
			}
		}
		
		return listPrimeDivisor;
	}
}

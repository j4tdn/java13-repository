package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Số nguyên tố tương đương
 * Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước  số nguyên tố.
 * Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là 3 và 5. 
 * Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
 * số này có là nguyên tố tương đương với nhau hay không?
 * Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
 * Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
 */
public class Ex04 {
	public static void main(String[] args) {
		long M,N;
		M = input();
		N = input();
		System.out.println(equivalentPrime(M, N));
	}
	
	private static long input() {
		Scanner input = new Scanner(System.in);
		long n;
		do {
			System.out.print("Nhập số: ");
			n = input.nextLong();
		} while( n < 2 || n > 3* Math.pow(10, 18));
		return n;
		
	}
	
	private static boolean isPrime(long n) {
		if(n > 2) {
			for(long i = 2; i <= Math.sqrt(n); i++ ) {
				if(n % i == 0 ) return false;
			}
		}
		return true;
	}
	
	private static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}
	
	private static String primeFactors(long numbers) {
        long n = numbers;
        String result = "";
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
            	result += i;
                n /= i;
            }
        }
        if (n > 1) {
        	result +=n;
        }
       
        return result;
    }
	
	private static String equivalentPrime(long M, long N) {
			if(M % N == 0 || N % M == 0) return "YES";
			else {
				String fac1 = primeFactors(M);
				String fac2 = primeFactors(N);
				fac1 = removeDuplicates(fac1);
				fac2 = removeDuplicates(fac2);
				if(fac1.contains(fac2) || fac2.contains(fac1)) return "YES";
				else return "NO";
				
			}
			
		
	}
	
	
}

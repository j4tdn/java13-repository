package ex04;

/**
 * Số nguyên tố tương đương
 * Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước số nguyên tố.
 * Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là 3 và 5.
 * Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các 
 * số này có là nguyên tố tương đương với nhau hay không?
 * Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
 * Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO
 */

public class Main {
	public boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public boolean isEquivalentPrimeNumber(int a, int b) {
		int min = Math.min(a, b);
		for (int i = 2; i <= min; ++i) {
			if (isPrime(i) && ((a % i == 0 && b % i != 0) || (a % i != 0 && b % i == 0)))
				return false;
		}
		return true;
	}

	public void testEquivalentPrimeNumber() {
		System.out.println(isEquivalentPrimeNumber(75, 15));
		System.out.println(isEquivalentPrimeNumber(60, 12));
		System.out.println(isEquivalentPrimeNumber(4, 1));
		System.out.println(isEquivalentPrimeNumber(52, 31));
		System.out.println(isEquivalentPrimeNumber(12, 18));
		System.out.println(isEquivalentPrimeNumber(13, 39));
	}
}

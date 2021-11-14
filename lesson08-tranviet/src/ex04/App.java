/**
 * Bài 4: Số nguyên tố tương đương
	Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
	số nguyên tố.
	Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
	3 và 5.
	Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
	số này có là nguyên tố tương đương với nhau hay không?
	Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
	Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
 */
package ex04;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input M: ");
		BigInteger M = new BigInteger(sc.nextLine());
		System.out.print("Input N: ");
		BigInteger N = new BigInteger(sc.nextLine());
		System.out.println("M: " + M);
		System.out.println("N: " + N);
		if (check(M, N)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}

	private static boolean check(BigInteger M, BigInteger N) {
		List<BigInteger> MList = primeList(M);
		System.out.print("MList: ");
		MList.forEach(i->System.out.print(i + " "));
		List<BigInteger> NList = primeList(N);
		System.out.print("\nNList: ");
		NList.forEach(i->System.out.print(i + " "));
		System.out.println();
		if (compareTwoList(MList, NList)) {
			return true;
		}
		return false;
	}

	private static boolean compareTwoList(List<BigInteger> mList, List<BigInteger> nList) {
		if (mList.size() != nList.size()) {
			return false;
		} else {
			for (int i = 0; i < mList.size(); i++) {
				if (mList.get(i).compareTo(nList.get(i)) != 0) {
					return false;
				}
			}
		}
		return true;
	}
	// Số quá lớn sẽ chạy chậm ==> FIX (Chạy được 15 số)
	private static List<BigInteger> primeList(BigInteger n) {
		List<BigInteger> primeList = new ArrayList<BigInteger>();
		for (BigInteger i = BigInteger.TWO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			if (n.mod(i).compareTo(BigInteger.ZERO) == 0) {
	//			if (isPrime(i)) {
					primeList.add(i);
	//			}
				while (n.mod(i).compareTo(BigInteger.ZERO) == 0) {
					n = n.divide(i);
				}
			}
		}
		return primeList;
	}

//	private static boolean isPrime(BigInteger n) {
//		if (n.compareTo(BigInteger.TWO) < 0) {
//			return false;
//		}
//		for (BigInteger i = BigInteger.TWO; i.compareTo(n.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
//			if (n.mod(i).compareTo(BigInteger.ZERO) == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
}

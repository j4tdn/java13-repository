package ex04;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class App {
	
	private static final BigInteger MAXVALUE = BigInteger.valueOf(300000000000000000l);

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		BigInteger n = BigInteger.ZERO;
		BigInteger m = BigInteger.ZERO;
		
		while(true) {
			try {
				n = inputNumber("n");
				m = inputNumber("m");
				break;
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// Tìm các ước nguyên tố của 2 số n và m
		List<BigInteger> primesN = EquivalentPrimeNumberUtils.listPrimes(n);
		List<BigInteger> primesM = EquivalentPrimeNumberUtils.listPrimes(m);
		
		// Liệt kê các ước nguyên tố của 2 số n và m
		showListPrimes(primesM, "m");
		showListPrimes(primesN, "n");
		
		// Kiểm tra m và n có là nguyên tố tương đương ?
		System.out.println("Are " + n + " and " + m + " equivalent prime number? ");
		System.out.println("=>>>> " + EquivalentPrimeNumberUtils.isEquivalentPrimeNumber(m, n));
		
		
	}
	
	private static void showListPrimes(List<BigInteger> primesM, String name) {
		System.out.println("List primes of " + name + " : ");
		primesM.forEach(i->System.out.print(i + " "));
		System.out.println();
	}
	
	private static BigInteger inputNumber(String name) {
		BigInteger bNumber = BigInteger.ZERO;
		System.out.print("Input number " + name + ": ");
		try {
			bNumber = BigInteger.valueOf(Long.parseLong(ip.nextLine()));
		}catch(NumberFormatException e) {
			throw new NumberFormatException("Input number");
		}
		if ((bNumber.compareTo(BigInteger.TWO) < 0) || (bNumber.compareTo(MAXVALUE) > 0)) {
			throw new NumberFormatException("Number cannot smaller 2 and bigger 300000000000000000");
		}
		
		return bNumber;
	}
}

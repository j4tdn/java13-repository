package ex04;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EquivalentPrimeNumberUtils {
	private EquivalentPrimeNumberUtils() {
	}
	
	public static String isEquivalentPrimeNumber(BigInteger m , BigInteger n) {
		List<BigInteger> primesM = listPrimes(m);
		List<BigInteger> primesN = listPrimes(n);
		return compareListPrimes(primesM, primesN) ? "YES" : "NO";
	}
	
	private static boolean compareListPrimes(List<BigInteger> primesM, List<BigInteger> primesN) {
		if (primesM.size() != primesN.size()) return false;
		for(int i = 0; i < primesM.size(); i++) {
			if (primesM.get(i).compareTo(primesN.get(i)) != 0)
				return false;
		}
		return true;
	}
	
	public static List<BigInteger> listPrimes(BigInteger m) {
		List<BigInteger> primes = new ArrayList<BigInteger>();
		for (BigInteger i = BigInteger.TWO; i.compareTo(m) <= 0; i = i.add(BigInteger.ONE)) {
			if (isPrime(i) && (m.mod(i).compareTo(BigInteger.ZERO) == 0)) {
				primes.add(i);
			}
			while (m.mod(i).compareTo(BigInteger.ZERO) == 0) {
				m = m.divide(i);
			}
		}
		return primes;
	}
	
	private static boolean isPrime(BigInteger number) {
		if (number.compareTo(BigInteger.TWO) < 0) return false;
		for (BigInteger i = BigInteger.TWO; i.compareTo(number.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
			if (number.mod(i).compareTo(BigInteger.ZERO) == 0) 
				return false;
		}
		return true;
	}
}

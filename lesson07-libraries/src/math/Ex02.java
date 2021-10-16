package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		// BigDecimal, BigInteger 
		// calculation method >> add, subtract, multiple, divide
		// round >> setScale, roundMOde
		
		// memory >> business >> format >> convention
		
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(278.18);
		BigDecimal e = BigDecimal.valueOf(136.15);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal multiply = d.multiply(e);
		BigDecimal div = d.divide(e,3,RoundingMode.HALF_UP);
		System.out.println("add: " + add);
		System.out.println("sub: " + sub);
		System.out.println("mul " + multiply);
		System.out.println("div " + div);
		
		// calculation
		double bigV = 99999 * 999999999999d;
		System.out.println("BigV: " + bigV);
		
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(999999999999d));
		System.out.println("bigD: " + bigD);
		double decV = 99.99 * 256.56789;
		System.out.println("decV: " + decV);
		BigDecimal decVRnd = BigDecimal.valueOf(decV).setScale(2,RoundingMode.HALF_UP);
		System.out.println("decVRnd: "+ decVRnd);
		
		System.out.println("HALF_UP: "+ BigDecimal.valueOf(7.49).setScale(0,RoundingMode.HALF_UP));
		
		
	}
}

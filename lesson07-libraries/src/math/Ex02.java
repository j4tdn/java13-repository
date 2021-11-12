package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		// business >> memory >> format >> convention
		// BigDecimal, BigInteger
		// calculation method >> add, subtract, multiple, divide
		// rounding >> setScale, roundingMode
		
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		
		BigDecimal d = BigDecimal.valueOf(27.726);
		BigDecimal e = BigDecimal.valueOf(182.19);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal mul = d.multiply(e);
		BigDecimal div = d.divide(e, 4, RoundingMode.HALF_UP);
		
		System.out.println("add = " + add);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		
		//calculation
		
		double bigV = 99999* 999999999999d;
		System.out.println("bigV: " + bigV);
		
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(999999999999d));
		System.out.println("bigD: " + bigD);
		
		double decV = 99.99 * 256.56789;
		System.out.println("decV: " + decV);
		
		BigDecimal decVRnd = BigDecimal.valueOf(decV).setScale(2, RoundingMode.HALF_UP);
		System.out.println("decVRnd: " + decVRnd);
			
		System.out.println("HALF-UP: " + BigDecimal.valueOf(7.49d).setScale(0, RoundingMode.HALF_UP));
		System.out.println("UP: " + BigDecimal.valueOf(7.49d).setScale(0, RoundingMode.UP));
	}
}

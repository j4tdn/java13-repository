package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		//business >> memory
		//BigDecimal, BigInteger 
		//calculation method >> add , subtract, multiple, devide
		//rounding >> setScale , roundingMode
		
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(27.3556);
		BigDecimal e = BigDecimal.valueOf(189.78);
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal mul = d.multiply(e);
		BigDecimal div = d.divide(e,2,RoundingMode.HALF_UP);
		
		System.out.println("add :" + add);
		System.out.println("sub :" + sub);
		System.out.println("mul :" + mul);
		System.out.println("div :" + div);
		
		double bigV = 9999 * 9999999d;
		System.out.println("bigV : " + bigV);
		
		BigDecimal bigD = BigDecimal.valueOf(9999).multiply(BigDecimal.valueOf(999999999d));
		System.out.println("bigD: " + bigD);
		
		double decV = 234.679 * 24.2648;
		System.out.println("decV: " + decV);
		
		BigDecimal decVRnd = BigDecimal.valueOf(decV).setScale(2, RoundingMode.HALF_UP);
		System.out.println("decVRnd: " + decVRnd );
		
		
		
	}
}

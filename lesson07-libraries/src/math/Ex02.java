package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		//BisDecimal, BigInteger
		//calculation method >> add, subtract, multiple, divide
		
		
		
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(27.745);
		BigDecimal e = BigDecimal.valueOf(182.36);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal multiple = d.multiply(e);
		BigDecimal div = d.divide(e, 2, RoundingMode.HALF_UP);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multiple);
		System.out.println(div);
		
		//calculation
		double bigV = 9999 * 999999999999d;
		
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(9999999999999d));
		
		System.out.println(bigD);
		
		double decV = 99.99 * 256.56789;
		System.out.println(decV);
		
		BigDecimal decVR = BigDecimal.valueOf(decV).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(decVR);
	}
}

package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		// nusiness>>memory>>format>>convention
		// BigDecimal,BigInteger
		// calculation method>>add,subtract, multiple,devide
		// rounding >>setScale,roundingMode

		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(6.78);
		BigDecimal e = BigDecimal.valueOf(2);
		
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal mul = d.multiply(e);
		BigDecimal div = d.divide(e, 2, RoundingMode.HALF_UP);
		System.out.println("add: "+add);
		System.out.println("sub: "+sub);
		System.out.println("mul: "+mul);
		System.out.println("div: "+div);
		
		//calculation
		double bigV=9999*9999999999d;
		System.out.println("bigV: "+bigV);
		
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(999999));
		System.out.println("bigD: "+bigD);
		
		double decV = 99.9*256.56879;
		System.out.println("decV: "+decV);
		
		BigDecimal decVRnd = BigDecimal.valueOf(decV).setScale(2,RoundingMode .HALF_UP);
		System.out.println("decVRnd: "+decVRnd);
		
		System.out.println("HALF_UP: "+BigDecimal.valueOf(7.49).setScale(0,RoundingMode.HALF_UP));
		
		
	}
}

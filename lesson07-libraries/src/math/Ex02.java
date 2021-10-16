package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		// bussiness >> memory >. format >> convention
		// số thập phân : BigDecimal; Số nguyên : BigInteger lưu trữ 1 khoảng lớn hơn
		//calculation method >> add, subtract, multiple, devide
		//rounding >> setScale, roundMode
		
		BigDecimal a = BigDecimal.ZERO;		
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(246.18);
		BigDecimal e = BigDecimal.valueOf(220.778);
		
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		System.out.println("c :" + c);
		System.out.println("d :" + d);
		System.out.println("e :" + e);
		
		BigDecimal mul = d.multiply(e);
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal div = d.divide(e,2 , RoundingMode.HALF_UP);
		
		System.out.println("add:" + add);
		System.out.println("sub :" + sub);
		System.out.println("mul :" + mul);
		System.out.println("div :" + div);
		
		// calculation
		double bigV = 99999 * 99999999999d;
		System.out.println("bigV : " + bigV);
		
		BigDecimal bigD = BigDecimal.valueOf(9999).multiply(BigDecimal.valueOf(9999999999d));
		System.out.println("bigD : " + bigD);
		
		double decV = 99.99*256.56879;
		System.out.println("decV : " + decV);
		
		BigDecimal decvRnd = BigDecimal.valueOf(decV).setScale(2,RoundingMode.HALF_UP);
		System.out.println("decVRnd : " + decvRnd);
		
		System.out.println("HALF_UP : " + BigDecimal.valueOf(7.49).setScale(0,RoundingMode.HALF_UP));
	}

}

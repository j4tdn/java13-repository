package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02 {
	public static void main(String[] args) {
		// Prioty: business >> memory >> format >> convention
		// BigDecimal (Class hay dùng đối với số thập phân)
		// BigInteger (Class hay dùng đối với số nguyên)
		// Support calculation method >> add, subtract, multiple, divide
		// Support Rounding >> setScale, roundingMode
		
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		BigDecimal d = BigDecimal.valueOf(278.726);
		BigDecimal e = BigDecimal.valueOf(182.19);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		
		BigDecimal add = d.add(e);
		BigDecimal sub = d.subtract(e);
		BigDecimal mul = d.multiply(e);
		BigDecimal div = d.divide(e, 2, RoundingMode.HALF_UP);
		// scale (làm tròn mấy chữ số); roundingMode(làm tròn trên, làm tròn dưới);
		
		System.out.println("add: " + add);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		System.out.println("div: " + div);
		
		// calculation 
		double bigV = 99999 * 999999999d;
		System.out.println("BigV: " + bigV); // Kết quả hiển thị E13(10^13)
		
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(999999999d));
		System.out.println("BigD: " + bigD); // Kết quả hiển thị rõ ràng các số 0
		
		double decV = 99.99 * 256.56879;
		System.out.println("decV: " + decV);
		
		// Làm tròn (~ số)
		BigDecimal decVRnd = BigDecimal.valueOf(decV)
									   .setScale(2, RoundingMode.HALF_UP);
		System.out.println("decVRnd: " + decVRnd);
		
		// Tóm lại, trong BigDecimal:
		// Divide => tích hợp sẵn Làm tròn trong HÀM
		// Mul => phải setScale để làm tròn
		
		System.out.println("HALF_UP: " + BigDecimal.valueOf(7.49).setScale(0, RoundingMode.HALF_UP));
		
		
		
		
		
		
	}

}

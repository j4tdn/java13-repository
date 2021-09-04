package data;

import java.util.Arrays;

public class Ex07 {
	public static void main (String[] args) {
		// line through >> deprecated
		Integer i1 = new Integer(10); // take time, space
		
		// Required: JAVA's available objects
		// E.g: Integer, Long, Double, String Character
		// 2 ways to declare variable
		// heap(normal) ->> Integer object
		Integer a1 = new Integer(10); //W1 // value = 10
		Integer a2 = new Integer(12); //W1 // value = 12
		Integer a3 = new Integer(10); //W1
		// ==> stack 3, heap 3
		System.out.println("a1 code: " + System.identityHashCode(a1));
		System.out.println("a2 code: " + System.identityHashCode(a2));
		System.out.println("a3 code: " + System.identityHashCode(a3));
		System.out.println("===================");
		
		// heap (constant pool) ->> Integer Literal
		Integer b1 = 20; //W2: JAVA Special (20 on HEAP)
		Integer b2 = 22;
		Integer b3 = 20;
		// ==> stack 3, heap 2

		System.out.println("b1 code: " + System.identityHashCode(b1));
		System.out.println("b2 code: " + System.identityHashCode(b2));
		System.out.println("b3 code: " + System.identityHashCode(b3));
		System.out.println("===================");
		
		b1 = 99; // # b1.value = 99; b1 = H10
		System.out.println("b1# code: " + System.identityHashCode(b1));
		System.out.println("===================");
		
		// Example: JAVA project: version 8
		int sum1 = sum(10, 20);
		System.out.println("sum1 :" + sum1);
		
		// Example: JAVA project: version 9
		int sum2 = sumAll(10, 20, 20, 50);
		System.out.println("sum2 :" + sum2);
	}
	
//	// JAVA version: 8
//	public static int sum(int a, int b) {
//		return a + b;
//	}

	// JAVA version: 9
	@Deprecated
	// Should use sumAll
	 public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sumAll(int ... nbrs) {
		return Arrays.stream(nbrs).sum();
	}
}

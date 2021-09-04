package data;

public class Ex07 {
	public static void main(String[] args) {
		// line through >> deprecated
		//Integer a = new Integer(10); // take time, space
		
		//Required: JAVA's available objects
		//E.g: Integer, Long, Double, String, Character
		// 2 ways to declare variable	
		// heap(normal) ->> Integer object
		Integer a1 = new Integer(10);  // W1
		Integer a2 = new Integer(12); 
		Integer a3 = new Integer(10); 
		// => Stack 3, heap 3
		System.out.println("a1 code: " + System.identityHashCode(a1));
		System.out.println("a2 code: " + System.identityHashCode(a2));
		System.out.println("a3 code: " + System.identityHashCode(a3));
		System.out.println("===============");
		
		// heap(constant pool) ->> Integer Literal
		Integer b1 = 20;	//W2 : Special
		Integer b2 = 22;
		Integer b3 = 20;
		// => Stack 3, heap 2
		System.out.println("b1 code: " + System.identityHashCode(b1));
		System.out.println("b2 code: " + System.identityHashCode(b2));
		System.out.println("b3 code: " + System.identityHashCode(b3));
		
		b1 = 22; //#b1.value = 99;
		System.out.println("b1# code: " + System.identityHashCode(b1));
		
		
		Integer c1 = 100;
		Integer c2 = 100;
		// .............
		Integer c100 = 100;

		
		//project: version 9
		//int sum = sumAll(10, 20, 30, 50);
		
	}
	
	// JAVA version: 8
	/* public static int sum(int a, int b) {
	 		return a + b;
	 }*/
	
	// JAVA version 9
	@Deprecated(since = "9")
	//Should use sumAll
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sumAll(int ... nbrs) {
		return a + b;
	}
}

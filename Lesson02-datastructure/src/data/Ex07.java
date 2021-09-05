package data;
import java.util.Arrays;
public class Ex07 {
	public static void main(String[] args) {
		// line through >> deprecated
		Integer a = new Integer(10);  // take time, space
		
		//required: JAVA's available objects
		// E.g: Integer, Long, Double, String, Character
		// 2 ways to declare variable
		Integer a1 = new Integer(10);  //W1
		Integer a2 = new Integer(12);
		Integer a21 = new Integer(10);
		//stack = 3, heap = 3
		
		Integer b1 = 20;   //W2 // special
		Integer b2 = 22;
		Integer b3 = 20;
		// stack = 3, heap = 2
		
		b1 = 99; // #b1.value = 99;
		
		//project: version 8
		int sum = sumAll(10,20);
		System.out.println("sum: " + sum);
		// Example: JAVA project: version 9

	}
	//JAVA version: 8
	//public static int sum(int a, int b) {
		//return a + b;
	//}
	// JAVA version 9
	@Deprecated(since = "9")  // annotation
	// Should use sumAll
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sumAll(int ... nbrs) {
		return Arrays.stream(nbrs).sum();
	}

}

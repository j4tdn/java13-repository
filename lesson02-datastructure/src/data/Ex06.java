package data;

public class Ex06 {
	public static void main(String[] args) {
		//Object type
		//Integer 
		Integer i1 = new Integer(15);
		Integer i2 = new Integer(20);
		System.out.println("i1: " +i1);
		System.out.println("i2: " +i2);
		System.out.println("i1 code: " +System.identityHashCode(i1));
		System.out.println("i1 code: " +System.identityHashCode(i2));
	}
}

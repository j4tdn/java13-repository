package data;
import bean.Digit;
public class Ex12 {
	public static void main(String[] args) {
		//primitive, object type
		//explain '=' operator
		int a = 5;
		a = 10;
		int b = 12;
		a = b;
		
		String s = "welcome";
		s = "say hello";
		String s1 = "bye";
		s = s1;
		
		Digit d = new Digit(20);
		d.value = 22;
		Digit d1 = new Digit(44);
		
		// explain final => cannot re-assign value at STACK
		// cannot use '=' operator again
		//convention: restrict unused, rubbish memory in JVM
		final int z1 = 10;
		//z1 = 100;  // stack
		
		final Integer i1=10;
		Integer i2 =20;
		//i1 = 100; // stack
		
		final Digit d2 = new Digit(99);
		Digit d3 = new Digit(101);
		//d2 = d3;
		
		// BUT could assign value at HEAP as usual
		d2.value = 8080;
		
		// constant pool -> JAVA available >> Integer, String, 
		
	}

}

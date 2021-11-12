package view;

public class Ex07 {
	public static void main(String[] args) {
		int a = 5;
		Integer b = 10;
		Integer c = null;
		
		// assign object to primitive
		a=b;
		a=c;
		
		// assign primitive to objects
		b=a;
		c=a;
	}
}

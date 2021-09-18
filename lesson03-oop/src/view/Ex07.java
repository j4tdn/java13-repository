package view;

public class Ex07 {

	public static void main(String[] args) {
		int a = 5;
		Integer b = 10;
		Integer c = null;
		
		a = b;
		a = c;
		
		b = a;
		c = a;
	}

}

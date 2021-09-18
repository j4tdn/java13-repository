package view;

public class Ex07 {
	public static void main(String[] args) {
		int a = 5;//primitive
		Integer b = 10;//object
		Integer c = null;//object
		
		//assige (gán) object to primitive >> unboxing
		a = b;
		a = c;//check null
		
		//assige (gán) primitive to object >> boxing
		b = a;
		c = a;
		
		//Casting
		//boxing : primitive to object
		//unboxing : object to primitive
	}
}

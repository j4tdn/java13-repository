package view;

import bean.Car;

public class Ex03 {
public static void main(String[] args) {
	//100%>>Operator == always compare values at stack
	
	//Object#equals compare 
	//
	int a1 = 5;
	int a2 = 10;
	System.out.println("(a1==a2) >>" +(a1==a2));
	System.out.println("=================");
	
	Car c1 = new Car();
	Car c2 = new Car();
	System.out.println("(c1==c2) >>" +(c1==c2));
	System.out.println("(c1 eq c2) >>" +(c1.equals(c2)));
	System.out.println("=================");
	//hash("c1 hash",c1);
	//hash("c2 hash",c2);
	//System.out.println("c1 hash:" + System.identityHashCode(c1));
	//System.out.println("c2 hash:" + System.identityHashCode(c1));
	
	Car c3 = new Car("S123","Manda","Black");
	Car c4 = new Car("S123","Lambo","Yellow");
	System.out.println("(c3==c4) >>" +(c3==c4));
	System.out.println("(c3 eq c4) >>" +(c3.equals(c4)));
	//hash("c3 hash",c3);
	//hash("c4 hash",c4);
	//System.out.println("c3 hash:" + System.identityHashCode(c3));
	//System.out.println("c4 hash:" + System.identityHashCode(c4));
	System.out.println("=================");
	
	
	String s1 = "hello";
	String s2 = "hello";
	hash("s3:",s1);
	hash("s4:",s2);
	System.out.println("(s1==s2) >>" +(s1==s2));
	System.out.println("(s1 eq s2) >>" +(s1.equals(s2)));
	//constant pool
	System.out.println("=================");
	String s3 = new String("hello");
	String s4 = new String("hello");
	hash("s3:",s3);
	hash("s4:",s4);
	System.out.println("(s3==s4) >>" +(s3==s4));
	System.out.println("(s3 eq s4) >>" +(s3.equals(s4)));
}
private static void hash(String prefix, Object o) {
	System.out.println("s hash:" + System.identityHashCode(o));
}
}

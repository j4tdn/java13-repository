package view;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 10;
		System.out.println("(a1 == a2)  >>  "+ (a1 == a2));
		System.out.println("-----------");
		
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("(c1 == c2) >> " + (c1 ==c2));
		System.out.println("(c1 == c2) >> " + (c1.equals(c2)));
		
		System.out.println("----------");
		
		Car c3 = new Car("S234", "Mazda", "Black");
		Car c4 = new Car("S234", "Lambo", "yellow");
		System.out.println("(c3 == c4) >> " + (c3 ==c4));
		System.out.println("(c3 == c4) >> " + (c3.equals(c4)));
		
	}
	private static void hash(String prefix, Car c) {
		System.out.println(prefix + ": "+ System.identityHashCode(c));
	}
}

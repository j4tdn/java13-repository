package view;

import bean.Car;

public class Ex03 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		System.out.println("c1.equals(c2) : " + c1.equals(c2));
		
		System.out.println("c1==c2 :" + (c1==c2));
		
		
		Car c3 = new Car("S123", "BMW", "RED");
		Car c4 = new Car("S123", "BMW", "RED");
		System.out.println("c3.equals(c4) : " + c3.equals(c4));
		System.out.println("c3==c4 :" + (c3==c4));
		
		
		String s1= "Hello";
		String s2= "Hello";
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1==s2 :" + (s1==s2));
		
		String s3= new String("Hello");
		String s4= new String("Hello");
		System.out.println("s3.equals(s4) : " + s3.equals(s4)); 
		//String đã định nghĩa lại hàm equals()
		System.out.println("s3==s4 :" + (s3==s4));
	}
}

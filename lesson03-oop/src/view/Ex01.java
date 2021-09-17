package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		// Demo create objects from Rectangle class
		// Rectangle() : Constructor of Rectangle class
		
		// R1: w8, h4
		// Khoi tao doi tuong, chua truyen gia tri cho thuoc tinh
		// Doi tuong se co gia tri mac dinh cho moi thuoc tinh
		Rectangle r1 = new Rectangle();  // w0 , h0
		//r1.width = 8;
		//r1.height = 4;
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: " + r1);   // auto calls toString method
		  
		// r2 : w10, h4.
		Rectangle r2 = new Rectangle();
		r2.setWidth(10);
		r2.setHeight(8);
		//r2.width = 10;
		//r2.height = 4;
		System.out.println("r2: " + r2);   // auto calls toString method
		
		// r3: w2, h6
		// Khoi tao va truyen gia tri cho thuoc tinh
		Rectangle r3 = new Rectangle(2,6);
		System.out.println("r3: " + r3);
		
		// Class, Object
		// Attribute, Method >> non-static
		// Constructor
		// Getter, Setter, toString
	}

}

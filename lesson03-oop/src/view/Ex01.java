package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		// demo create object from Rectangle class
		
		//R1:w8,h4
		Rectangle r1 = new Rectangle();
//		r1.width = 8;
//		r1.height =4;		
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: "+r1);//auto calls toString method
		
		Rectangle r2 = new Rectangle();
//		r2.width = 10;
//		r2.height =3;	
		r2.setWidth(10);
		r2.setHeight(4);
		System.out.println("r2: "+r2);
		
		//r3:w2,h6
		//Khoi tao va truyen gia tri cho thuoc tinh
		Rectangle r3 = new Rectangle(2,6);
		System.out.println("r3 : "+r3);
		
	}
}

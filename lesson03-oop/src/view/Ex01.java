package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		//Demo create objects from Rectangle class
		
		Rectangle r1 = new Rectangle();
//		r1.width = 4;
//		r1.height = 8;
		r1.setWidth(4);
		r1.setHeight(8);
		System.out.println(r1.getWidth());
		System.out.println(r1.getHeight());
		System.out.println("r1: " + r1);
		
		Rectangle r2 = new Rectangle(2,6);
		System.out.println("r2: " + r2.toString());
		
//		class, object
//		attribute, method
//		constructor
//		getter, setter,toString
		
	}
}

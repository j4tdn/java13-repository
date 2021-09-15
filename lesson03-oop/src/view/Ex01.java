package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: " + r1);
		
		Rectangle r2 = new Rectangle();
		r2.setWidth(10);
		r2.setHeight(4);
		System.out.println("r2: " + r2);
		
		Rectangle r3 = new Rectangle(2, 6);
		System.out.println("r3: " + r3);
	}
}

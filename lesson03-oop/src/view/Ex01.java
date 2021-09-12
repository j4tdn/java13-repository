package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 4;
		r1.height = 8;
		System.out.println("r1: " + r1);
		
		Rectangle r2 = new Rectangle();
		r2.width = 10;
		r2.height = 4;
		System.out.println("r2: " + r2);
		
		Rectangle r3 = new Rectangle(2, 6);
		System.out.println("r3: " + r3);
	}
}

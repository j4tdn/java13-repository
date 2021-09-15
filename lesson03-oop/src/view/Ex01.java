package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		//Demo create objects from rectangle class
		//Rectangle() : constructor of Rectangle class
		//R1.W8,H4
		
		//Khoi tao doi tuong chua truyen gia tei cho thuocj tinh
		// Doi tuong se co gia tri mac dinh cho moi thuoc tinh
		Rectangle r1 = new Rectangle();
//		r1.width = 8;
//		r1.height = 4;
		r1.setHeigh(4);
		r1.setWidth(8);
		System.out.println("r1: "+ r1.toString());
		Rectangle r2 = new Rectangle();
//		r2.width =10;
//		r2.height = 4;
		r2.setWidth(10);																	
		r2.setHeigh(4);
		System.out.println("r2: "+ r2);
	}
}
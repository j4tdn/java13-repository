package view;

import bean.Rectangle;

public class Ex01 {
	
	public static void main(String[] args) {
		// Demo create objects from Rectangle class
		// Rectangle(): width, height
		
		// R1. width = 8, height = 4
		// Khởi tạo đối tượng, chưa tuyền giá trị cho thuộc tính
		// Đối tượng sẽ có giá trị mặc định cho mỗi thuộc tính
		Rectangle r1 = new Rectangle();
		r1.setWidth(8);
		r1.setHeight(4);
		System.out.println("r1: " + r1); // auto calls toString method
		
		// r2: width = 10; height = 6;
		Rectangle r2 = new Rectangle();
		r2.setHeight(7);
		r2.setHeight(5);
		
		// r3: width = 2; height = 6;
		Rectangle r3 = new Rectangle(10, 3);
		System.out.println("r3: " + r3);
	}
}

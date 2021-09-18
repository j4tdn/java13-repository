package view;

import bean.Rectangle;

public class Ex01 {
	public static void main(String[] args) {
		// Demo create objects from Rectangle class
		// Rectangle(): constructor of Rectangle class
		
		// r1: w8, h4
		// Khởi tạo đối tượng, chưa truy�?n giá trị cho thuộc tính
		// �?ối tượng sẽ có giá trị mặc định cho mỗi thuộc tính
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(8);
		r1.setHeight(4); 	
		System.out.println("r1: " + r1); // auto calls toString method
		
		// r2: w10, h4
		Rectangle r2 = new Rectangle();
		r2.setWidth(10);
		r2.setHeight(4);		
		System.out.println("r2: " + r2);
		
		// r3: w2, h6
		// Khởi tạo và truy�?n giá trị cho thuộc tính
		Rectangle r3 = new Rectangle(2, 6);
		System.out.println("r3: " + r3);
		
		// Class, Object
		// Attribute, Method >> non-static
		// Constructor 
		// Getter, Setter, ToString
	}
}

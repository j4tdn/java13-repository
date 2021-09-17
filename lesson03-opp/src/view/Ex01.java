package view;

import bean.Rectangle;

public class Ex01 {
    public static void main(String[] args) {
		//demo create object from Rectangle class
    	
    	//R1: w8 , h4
    	//khởi tạo đối tượng truyền thuộc tính cho đối tượng
    	// Đối tượng khởi tạo sẽ có gia trị mặc định cho mỗi thuộc tính
    	Rectangle r1 = new Rectangle();
    	//r1.width = 8;
    	//r1.height = 4;
    	r1.setWidth(8);
    	r1.setHeight(8);
    	System.out.println("r1; "+r1);
    	//System.out.println("r1: "+ r1.toString());//auto calls toString method
    	
    	//r2: w10 , h4
    	Rectangle r2 = new Rectangle();
    	//r2.width = 10;
    	//r2.height = 4;
    	System.out.println("r2: "+ r2);
    	
    	Rectangle r3 = new Rectangle(4,5);
    	System.out.println("r3: " + r3);
	}
}

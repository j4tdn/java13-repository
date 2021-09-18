package view;

import bean.Rectangle;

public class Ex02 {
	public static void main(String[] args) {
		// How many objects were created as the code below
		// Khi khởi tạo ô nhớ trên HEAP => 1 đối tượng được tạo ra
			Integer a = 10; // 1 - kiểm tra trên Constant pool đã có ô nhớ chứa giá trị này chưa? 
			String b = new String("hello"); // 2
			float c = 10.2f;
			Double d = 7d; // 3
			Rectangle r1 = null; // KO (vẫn ở STACK; "null=> chưa khởi tạo Object => chưa có ô nhớ trên HEAP)
			System.out.println(r1.getHeight());
			Rectangle r2 = new Rectangle(); // 4 
			Rectangle r3 = r2; // KO (VD: r2(H2) => r3(H2) => không tạo ô nhớ mới trên HEAP => Ko phải Object
			String f = "welcome"; // 5
	}

}

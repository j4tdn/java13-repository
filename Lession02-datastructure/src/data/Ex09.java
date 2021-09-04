package data;

import bean.Item;


public class Ex09 {
	public static void main(String[] args) {
		//self object : tự khởi tạo
		Item i1 = new Item(1, "cake", 20);
		Item i2 = new Item(2, "candy", 50);
		Item i3 = new Item(3, "milk", 30);
		Item i4 = new Item(4, "coffee", 60);
		
		i1.price = 82;
		i1.id = 2;
		i1 = new Item(1, "cake", 63);
		i1.id = 2;
		//print an object variable >> sẽ tự động gọi hàm toString trong object
		//root java class >> class
		System.out.println("===================");
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("i4: " + i4);
	}
}
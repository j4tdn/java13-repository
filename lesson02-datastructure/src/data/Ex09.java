package data;

import bean.Item;

public class Ex09 {
	public static void main (String[] args) {
		// self objects
		Item i1 = new Item(1, "cake", 20);
		Item i2 = new Item(2, "candy", 50);
		Item i3 = new Item(3, "milk", 30);

		System.out.println("i1: " + i1.id);
		System.out.println("i1: " + i1.name);
		System.out.println("i1: " + i1.price);
		
		System.out.println("=================");
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		
		//modify root memory cell
		i1.price = 82;
		
		//point to another heap memory
		i1 = new Item(1, "cake", 63);
		// Print an object variable ->> auto call toString method of class Object
		// Root JAVA class >> Object		
		System.out.println("=================");
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
	}
}

package data;

import bean.Item;

public class Ex09 {
	public static void main(String[] args) {
		// self objects
		Item i1 = new Item(1, "cake", 20);
		Item i2 = new Item(1, "candy", 50);
		Item i3 = new Item(1, "milk", 30);
		
		//Integer i = 5;
		//String z = "hello";
		
		// point to another heap memory
		i1.price = 82;
		i1 = new Item(1, "cake", 63);
		// Print an object variable -> auto call toString method of class
		// Root JAVA class >> Object
		System.out.println("i: " + i1);
		System.out.println("z: " + i2);
		System.out.println("i1: " + i3);
		
	}
}

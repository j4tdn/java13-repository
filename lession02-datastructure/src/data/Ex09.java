package data;

import bean.Item;

public class Ex09 {
	public static void main(String[] args) {
		Item i1 = new Item(1, "cake", 20);
		Item i2 = new Item(2, "candy", 30);
		Item i3 = new Item(3, "milk", 50);
		//HEAP of i1->>H1 >> update price of H1
		i1.price = 82;
		//create a new HEAP >> i1->>new HEAP 
		i2 = new Item(1, "cady", 63);
		
		System.out.println("=============");

		//print an object variable ->> auto call toString method of class Object
		//Root JAVA class >> Object
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
	}
}

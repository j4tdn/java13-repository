package data;
import bean.Item;

public class Ex09 {
	public static void main(String[] args) {
		//self oblect
		Item i1 = new Item(1,"cake",20);
		Item i2 = new Item(2,"candy",50);
		Item i3 = new Item(3,"milk",100);
		//modify root heap memory
		i1.price = 82;
		//point to another heap memory
		i1 = new Item(1,"cake",63);
		System.out.println("i1: "+i1);
		System.out.println("i2: "+i2);
		System.out.println("i3: "+i3);
	}
}

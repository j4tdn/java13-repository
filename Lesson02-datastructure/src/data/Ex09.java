package data;
import bean.Item;
public class Ex09 {
	public static void main(String[] args) {
		// self object
		Item i1 = new Item(1, "cake", 20);
		Item i2 = new Item(2, "cake", 50);
		Item i3 = new Item(3, "cake", 30);
		
		Integer i = 5;
		String z = "hello";
		
		// modify root heap memory
		i1.price = 82;
		
		// point to another heap memory
		i1 = new Item(1, "cake", 63);
		
		// Print an object ->> auto call toString method of class Object
		// Root JAVA claa >> Object
		System.out.println("i: " + i);
		System.out.println("z: " + z);
		System.out.println("i1: " + i1);
		System.out.println("i1: " + i2);
		System.out.println("i1: " + i3);
	}

}

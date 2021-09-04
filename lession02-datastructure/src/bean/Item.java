package bean;

public class Item {
	// Attribute || Global variables
	public int id;
	public String name;
	public double price;
	
	// Constructor
	// Access Modifier + Class Name
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + ", name: " + this.name + ", price: " + this.price;
	}
}

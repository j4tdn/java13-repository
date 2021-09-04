package bean;

public class Item {
	// attributes >> global variable
	public int id;
	public String name;
	public double price;
	
	// constructor
	// no return type & method name same as class name
	public Item(int pId, String pName, double pPrice) {
		this.id = pId;
		this.name = pName;
		this.price = pPrice;
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}

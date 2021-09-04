package bean;

public class Item {
	//attribute>>global variable
	public int id;
	public String name;
	public double price;
	
	//constructor
	//no return type & method name same as class name
	public Item(int pId,String pName, double pPrice) {
		this.id = pId;
		this.name = pName;
		this.price = pPrice;
	}
	public String toString() {
		return this.id + ","+this.name+","+this.price;
	}
}

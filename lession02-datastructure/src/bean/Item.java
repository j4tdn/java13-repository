package bean;

public class Item {
	public int id;
	public String name;
	public double price;
	
	public Item(int pId, String pName, double pPrice) {
		this.id = pId;
		this.name = pName;
		this.price = pPrice;
	}
	
	public String toString() {
		return this.id + "," + this.name + "," + this.price;
	}
	
	
}	
	
	


	

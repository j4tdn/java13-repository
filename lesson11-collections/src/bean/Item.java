package bean;

public class Item implements Comparable<Item>{
	private int storeID;
	private int itemID;
	private String name;
	private double price;
	
	public Item() {
		
	}

	public Item(int storeID, int itemID, String name, double price) {
	
		this.itemID = itemID;
		this.storeID = storeID;
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(! (obj instanceof Item)) return false; 
		
		Item that = (Item)obj;
		return getStoreID() == that.storeID
			&& getItemID() == that.itemID;
	}
	
	@Override
	public String toString() {
		return "Item [storeID=" + storeID + ", itemID=" + itemID + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Item o) {
		return Double.compare(getPrice(), o.getPrice());
	}

	
	
	
}

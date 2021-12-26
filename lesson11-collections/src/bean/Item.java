package bean;

public class Item implements Comparable<Item>{
	
	private int storeId;
	private int itemID;
	private String name;
	private double price;

	public Item() {
	}

	public Item(int storeId, int itemID, String name, double price) {
		this.storeId = storeId;
		this.itemID = itemID;
		this.name = name;
		this.price = price;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [storeID=" + storeId + ", itemID=" + itemID + ", name=" + name + ", price=" + price + "]";
	}
	
	// Compile java.util.ArrayList#320 (Object) o.equals(es[i])
	// o is Item at runtime
	// runtime: jump to Item.equals
	// this: item
	// o: es[i]
	@Override
	public boolean equals(Object o) {
		
		if(this == o) return true;
		
		// Requirement: 2 items are equals if (same as storeID && itemID && name && price)
		if(o instanceof Item) {
			Item item = (Item) o;
			return (storeId == item.getStoreId() 
					&& itemID == item.getItemID() 
					&& name.equals(item.getName()) 
					&& price == item.getPrice());
		}  
		
		return false;
	}
	
	// this: previous item
	// o   : next item
	@Override
	public int compareTo(Item o) {
		return Double.compare(price, o.getPrice());
	}
}

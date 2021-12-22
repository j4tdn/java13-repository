package bean;

public class Item implements Comparable<Item>{
	private int storeId;
	private int itemId;
	private String name;
	private double price;

	public Item() {
	}

	public Item(int storeId, int itemId, String name, double price) {
		this.storeId = storeId;
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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
	
	
	// compile  java.util.ArrayList#320 (Object) o.equals(es[i])
	// o is Item at runtime
	// runtime: jump to Item#equals
	
	// this: item
	// o: es[i]
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		// Requirement: 2 items are equals if (same as storeId & itemId & name & price)
		// if (!(o instanceof Item)) {
			// return false;
		// }
		if (o == null || o.getClass() != getClass()) {
			return false;
		}
		
		Item that = (Item)o;
		
		return getStoreId() == that.getStoreId()
			&& getItemId()  == that.getItemId()
			&& getPrice()   == that.getPrice()
			&& getName().equals(that.getName());
	}
	
//	@Override
//	public boolean equals(Item that) {
//		return getStoreId() == that.getStoreId()
//			&& getItemId()  == that.getItemId()
//			&& getPrice()   == that.getPrice()
//			&& getName().equals(that.getName());
//	}
	
	// this: previous item
	// o   : nextItem
	
	@Override
	public int compareTo(Item o) {
		return Double.compare(getPrice(), o.getPrice());
	}

	@Override
	public String toString() {
		return "Item [storeId=" + storeId + ", itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
}

package bean;


public class Item {
	private int storeId;
	private int itemId;
	private String name;
	private double price;
	public Item(int storeId, int itemId, String name, double price) {
		super();
		this.itemId = itemId;
		this.storeId = storeId;
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		// Requirement: 2 items are equals if (same as storeId, itemId, name, price)
		   // o.getCass() != Item.Class
		if (!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item) o;
		return this.getStoreId() == that.getStoreId()
			&& getItemId() == that.getItemId()
			&& getName().equals(that.getName())
			&& getPrice() == that.getPrice();
	}
	
	@Override
	public String toString() {
		return "Item [storeId=" + storeId + ", itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	

}

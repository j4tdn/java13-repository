package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item>{
	
	private int id;
	private String name;
	private double price;
	private LocalDate expiredDate;
	
	public Item() {
	}

	public Item(int id, String name, double price, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.expiredDate = expiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "\nItem [id=" + id + ", name=" + name + ", price=" + price + ", expiredDate=" + expiredDate + "]\n";
	}

	@Override
	// compare 2 items
	// 1: this >> current Item
	// 2: o >> next Item
	
	// Each: Item
	// Compare >> id || name || price
	public int compareTo(Item o) {
		// ID ASC
		// return this.getId() - o.getId();
		
		// ID DESC
		// return o.getId() - getId();
		
		// NAME ASC
		// return getName().compareTo(o.getName());
		
		// Expire Date ASC
		// return this.getExpiredDate().compareTo(o.getExpiredDate());
		
		// Price ASC, ID ASC
		if(getPrice() - o.getPrice() == 0) {
			return getId() -  o.getId() ;
		}
		
		return (int) (getPrice() - o.getPrice());
				
	}
	
	
}

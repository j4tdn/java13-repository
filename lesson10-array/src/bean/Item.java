package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item> {
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
		return "\nItem [id=" + id + ", name=" + name + ", price=" + price + ", expiredDate=" + expiredDate + "]";
	}

	@Override
	public int compareTo(Item o) {
		// ID ASC
		// return this.getId() - o.getId();

		// ID DESC
		// return o.getId() - this.getId();

		// Name ASC
		// return this.getName().compareTo(o.getName());

		// Expired Date ASC
		// return this.getExpiredDate().compareTo(o.getExpiredDate());

		// Price ASC, ID ASC
		double rs = this.getPrice() - o.getPrice();
		if (rs > 0)
			return 1;
		if (rs < 0)
			return -1;

		return this.getId() - o.getId();
	}

}

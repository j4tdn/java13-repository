package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetails[] itemDetails;
	private LocalDateTime orderDay;
	
	public Order() {
	}

	public Order(Customer customer, ItemDetails[] itemDetails, LocalDateTime orderDay) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDay = orderDay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetails[] getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetails[] itemDetails) {
		this.itemDetails = itemDetails;
	}

	public LocalDateTime getOrderDay() {
		return orderDay;
	}

	public void setOrderDay(LocalDateTime orderDay) {
		this.orderDay = orderDay;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDay="
				+ orderDay + "]";
	}
	
	
}

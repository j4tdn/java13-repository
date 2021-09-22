package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Order {
	private Customer customer;
	private ItemDetail [] itemDetial;
	private LocalDateTime orderDate;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customer customer, ItemDetail[] itemDetial, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetial = itemDetial;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItemDetial() {
		return itemDetial;
	}

	public void setItemDetial(ItemDetail[] itemDetial) {
		this.itemDetial = itemDetial;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double export() {
		double totalMoney = 0;
		ItemDetail [] ids = getItemDetial();
		for(ItemDetail id:ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost()*quantity;
			if(item.getCost() > 590  && LocalDate.of(2021, Month.MAY, 8).isEqual(getOrderDate().toLocalDate())) {
				idCost *=0.9;
			}
			totalMoney +=idCost;	
		}
		return totalMoney;
	}
}
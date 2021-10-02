package ex05;

import java.util.Arrays;

public class OrderDetail {
	private Customer customer;
	private Order[] order;
	
	public OrderDetail() {
	
	}

	public OrderDetail(Customer customer, Order[] order) {
		this.customer = customer;
		this.order = order;
	}

	

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order[] getOrder() {
		return order;
	}

	public void setOrder(Order[] order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetail [customer=" + customer + ", order=" + order + "]";
	}

	
	
}

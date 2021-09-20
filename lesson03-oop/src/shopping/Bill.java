package shopping;

import java.time.LocalDateTime;

public class Bill {
	private Customer customer;
	private PhoneDetails[] phoneDetails;
	private LocalDateTime dateTime;

	public Bill() {
	}

	public Bill(Customer customer, PhoneDetails[] phoneDetails, LocalDateTime dateTime) {
		this.customer = customer;
		this.phoneDetails = phoneDetails;
		this.dateTime = dateTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PhoneDetails[] getPhoneDetails() {
		return phoneDetails;
	}

	public void setPhoneDetails(PhoneDetails[] phoneDetails) {
		this.phoneDetails = phoneDetails;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		String space = "================================||=================================";
		return "=> Infomation of customer: \n" + customer + "" + 
				"\n=> Things bought: \n" + BillUtils.getAllPhoneDetails(this) +
				"=> At: " + dateTime + 
				"\n=> TotalPrice: " + BillUtils.getTotalPrice(this) + "\n" + space;
	}



	
}

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
		return "=> Infomation of customer: \n" + customer + ""
				+ "\n=> Things bought: \n" + getAllPhoneDetails() + 
				"=> At: " + dateTime + "\n=> TotalPrice: "+ getTotalPrice() +
				"\n" + space;
	}
	public String getAllPhoneDetails() {
		String str = "";
		for(PhoneDetails pD : phoneDetails) {
			str+= pD.toString() + "\n";
		}
		return str;
	}
	public double getTotalPrice() {
		double toTal = 0d;
		for (PhoneDetails pD : phoneDetails) {
			toTal += pD.getPhone().getPrice() * pD.getQuantity();
		}

		if (dateTime.getDayOfMonth() == 8 && dateTime.getMonthValue() == 5) {
			return toTal - toTal * 10 / 100;
		} else {
			return toTal;
		}
	}
}

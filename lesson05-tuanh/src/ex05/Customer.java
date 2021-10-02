package ex05;

public class Customer {
	private String customerCode;
	private String fullName;
	private int phoneNumber;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(String customerCode, String fullName, int phoneNumber, String address) {
		this.customerCode = customerCode;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer: customerCode = " + customerCode + "; fullName = " + fullName 
				+ "; phoneNumber = " + phoneNumber + "; address = " + address;
	}
	
}

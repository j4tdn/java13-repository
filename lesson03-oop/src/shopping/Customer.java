package shopping;

public class Customer {
	
	private String name;
	private String phoneNumber;
	private String idCard;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phoneNumber, String idCard, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.idCard = idCard;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", idCard=" + idCard + ", address=" + address
				+ "]";
	}
	
	
}

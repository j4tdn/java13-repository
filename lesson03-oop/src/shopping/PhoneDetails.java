package shopping;

public class PhoneDetails {
	private Phone phone;
	private int quantity;

	public PhoneDetails() {
	}

	public PhoneDetails(Phone phone, int quantity) {
		this.phone = phone;
		this.quantity = quantity;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return phone + ", Quantity=" + quantity;
	}
	
	
}

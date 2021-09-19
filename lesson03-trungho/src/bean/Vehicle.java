package bean;

public class Vehicle {
	private Double cylinderCapacity;
	private Double price;
	private String owner;
	private String type;
	private Double tax;
	
	public Vehicle() {
	}
	
	public Vehicle(Double cylinderCapacity, Double price, String owner, String type, Double tax) {
		this.cylinderCapacity = cylinderCapacity;
		this.price = price;
		this.owner = owner;
		this.type = type;
		this.tax = tax;
	}

	public Double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(Double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Vehicle [cylinderCapacity=" + cylinderCapacity + ", price=" + price + ", owner=" + owner + ", type="
				+ type + ", tax=" + tax + "]";
	}
}

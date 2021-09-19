package shopping;

public class Phone {
	private String IDPhone;
	private String OS;
	private String color;
	private Double price;

	public Phone() {
	}

	public Phone(String IDPhone, String OS, String color, Double price) {
		this.IDPhone = IDPhone;
		this.OS = OS;
		this.color = color;
		this.price = price;
	}

	public String getIDPhone() {
		return IDPhone;
	}

	public void setIDPhone(String IDPhone) {
		this.IDPhone = IDPhone;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "IDPhone=" + IDPhone + 
				", OS=" + OS + 
				", Color=" + color + 
				", Price=" + price;
	}

}

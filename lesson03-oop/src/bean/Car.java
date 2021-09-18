package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	private Double price;
	
	public Car() {

	}

	public Car(String serial, String model, String color) {
		this.serial = serial;
		this.model = model;
		this.color = color;
	}

	public Car(String serial, String model, String color, Double price) {
		this(serial, model, color);
		this.setPrice(price);
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return serial + ", " + model + ", " + color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Car)) {
			return false;
		}
		if (getSerial() == null) {
			return false;
		}
		return this.getSerial().equals(((Car) obj).getSerial());

	}


}

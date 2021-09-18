package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	private Double price;

	public Car() {
	}

	public Car(String serial, String model, String color) {
		/*
		 * this.serial = serial; 
		 * this.model = model; 
		 * this.color = color;
		 */
		this(serial, model, color, 0d);
	}

	public Car(String serial, String model, String color, double price) {
		super();
		this.serial = serial;
		this.model = model;
		this.color = color;
		this.price = price;
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

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return serial + "," + model + "," + color;
	}

	@Override
	public boolean equals(Object obj) {
		// this >> car
		// true when 2 cars have the same serial
		if (this == obj) {
			return true;
		}
		// Object >> not a car
		if (!(obj instanceof Car)) {
			return false;
		}
		// Obj >> a car
		Car that = (Car) obj;

		return getSerial() == null ? false : getSerial().equals(that.getSerial());
	}
}

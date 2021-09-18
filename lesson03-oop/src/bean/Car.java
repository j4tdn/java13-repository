package bean;

public class Car {
	// attributes, constructor, getter, setter, [hashcode], equals, toString
	private String serial;
	private String model;
	private String color;
	
	// double luon co gia tri, mac dinh bang 0d
	// Double chua co gia tri, mac dinh la null
	private Double price;
	
	// Database >> Table >> column >> NULL/VALUE
	
	public Car() {
	}
	
	// required
	public Car(String serial, String model, String color) {
		//this.serial = serial;
		//this.model = model;
		//this.color = color;
		this(serial, model, color, null);
	}

	public Car(String serial, String model, String color, Double price) {
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

	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
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
		if(!(obj instanceof Car)) {
			return false;
		}
		// Obj >> a car
		Car that = (Car)obj;
		
		return getSerial() == null ? false
								   : getSerial().equals(that.getSerial());
	}
}

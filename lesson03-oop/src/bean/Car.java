package bean;

public class Car {
	// attributes, constructor, getter, setter, [hashcode], equal, toString
	private String serial;
	private String modal;
	private String color;
	
	// double luôn có giá trị mặc định là: 0d
	// Double chưa có giá trị - null, có giá trị 0 hoặc 1 giá trị bất kì
	private Double price;
	
	// Database >> Table >> Column >> NULL/VALUE/ UNDIFIED (not in Java)
	// JAVA 1.5 >> Generic, Collection
	
	public Car() {
	}
	
	public Car(String serial, String modal) {
		//this.serial = serial;
		//this.modal = modal;
		
		this(serial, modal, null);
	}
	
	public Car(String serial, String modal, String color) {
		//this.serial = serial;
		//this.modal = modal;
		//this.color = color;
		
		this(serial, modal, color, null);
	}
	
	public Car(String serial, String modal, String color, Double price) {
		this.serial = serial;
		this.modal = modal;
		this.color = color;
		this.price = price;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
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
	public boolean equals(Object obj) {
		// this >> car
		// true when 2 cars have the same serial
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Car)) {
			return false;
		}
		
		// obj >> a car
		Car that = (Car)obj;
		
		/*
		if (getSerial() == null) {
			return false;
		}
		
		return getSerial().equals(that.getSerial());
		*/
		
		return getSerial() == null ? false
								   : getSerial().equals(that.getSerial());
		
	}

	@Override
	public String toString() {
		return serial + "," + modal + "," + color;
	}
}

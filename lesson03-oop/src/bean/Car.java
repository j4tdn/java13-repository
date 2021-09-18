package bean;

import bean.Car;

public class Car {
	private String serial;
	private String model;
	private String color;
	private Double price;
	
	public Car() {
	}

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
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override // override "equals"
	
	public boolean equals(Object obj) {
		// this >> a car (car là đối tượng được tạo ra từ Class Car)
		// true when 2 cars have the same serial
		if (this == obj) { // chưa biết thuộc kiểu data gì, nhưng "==" chứng tỏ nằm cùng một ô nhớ
			return true;
		}
		
		// object >> not a car (this=car; this==obj => nếu obj≠car => false)
		if (!(obj instanceof Car)) {
			return false;
		}
		// nếu sai thì đã stop↑
		// nếu đúng thì ↓
		// obj >> a car 
		Car that = (Car)obj; // obj = that (another car)
		
		// getSerial() == null => return false
		// : (ngược lại) => getSerial().equals(that.getSerial())
		return getSerial() == null ? false
				  				   : getSerial().equals(that.getSerial());
		
		
	}

	@Override
	public String toString() {
		return serial + ", " + model + ", " + color;
	}
	
	

	
}

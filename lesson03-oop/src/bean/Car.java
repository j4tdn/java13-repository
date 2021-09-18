package bean;

public class Car {
	//attributes,constructor,getter,setter,[hashcode],tostring
	//no getter setter doi voi static
	private String serial;
	private String model;
	private String color;
	private Double price;
	//double luon co gia tri
	//Double chua  co gia tri,co gia tri
	public Car() {
	}
	public Car(String serial, String model, String color) {
//		this.serial = serial;
//		this.model = model;
//		this.color = color;
		this(serial,model,color,null);
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
	public boolean equals(Object obj) {
		//this >>a car
		//true when 2 cars have the smae serial
		if(this==obj) {
			return true;
		}
		//obj>>not a car
		if(!(obj instanceof Car)) {
			return false;
		}
		Car that =(Car)obj;
		return getSerial()==null ? false
								 :getSerial().equals(that.getSerial());
		//obj>>a car
//		Car that =(Car)obj;
//		return this.getSerial().equals(that.getSerial());
	}
	@Override
	public String toString() {
		return serial+","+model+","+color;
	}
}

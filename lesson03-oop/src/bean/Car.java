package bean;

public class Car {
	private String serial;
	private String model;
	private String color;
	
	public Car() {
	}

	public Car(String serial, String model, String color) {
		this.serial = serial;
		this.model = model;
		this.color = color;
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

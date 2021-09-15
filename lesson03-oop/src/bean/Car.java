package bean;

public class Car {
	private String serial;
	private String modal;
	private String color;
	
	public Car() {
	}

	public Car(String serial, String modal, String color) {
		this.serial = serial;
		this.modal = modal;
		this.color = color;
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

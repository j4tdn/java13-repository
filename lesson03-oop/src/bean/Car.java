package bean;

public class Car {
	private String serial;
	private String model;
     private String color;
     
     public Car() {
		// TODO Auto-generated constructor stub
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
	@Override //khi một lớp con kế thừa 1 lợp cha thì mình định nghĩa lại
	public boolean equals(Object obj) {
		
		if(this== obj) {
			return true;
		}
		
		if(!(obj instanceof Car)) {
			return false;
		}
		Car that = (Car)obj;
		return getSerial() == null ? false
				 : getSerial().equals(that.getSerial());
	}
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return serial + "," + model + "," + color ;
    }
}
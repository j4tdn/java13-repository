package bean;

public class Car {
	//attributes, constructior,getter,setter,[hashcode],equals,toString
	private String serial;
	private String model;
    private String color;
     
     //double luôn có giá trị ,mặc địinh bằng 0d
     //Double cưa cso giá trị - null, có giúa trị 0 hoặc có giá trị bất kỳ
     private Double price;
     
     //Database >> Table >> Colum >> Null/Value
     public Car() {
		
	}
     //required
     public Car(String serial,String model) {
    	 this.serial = serial;
    	 this.model = model;
    	 
     }

	public Car(String serial, String model, String color) {
		//this.serial = serial;
		//this.model = model;
		//this(serial,model);
		//this.color = color;
		this(serial, model, color, 0d);
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
    	return serial + "," + model + "," + color + "," + price;
    }
}

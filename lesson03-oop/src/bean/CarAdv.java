package bean;

public class CarAdv {
	private String color;
	public  static String model;
	
	public CarAdv() {
		// TODO Auto-generated constructor stub
	}

	

	public CarAdv(String color) {
		this.color = color;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return model + ", "+ color;
	}
	 
	
}

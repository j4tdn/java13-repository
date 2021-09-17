package bean;

public class CarAdv {
public static String model;
	
	private String color;
	
	public CarAdv() {}
	
	public CarAdv(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model + ", " + color;
	}

}

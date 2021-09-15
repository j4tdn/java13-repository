package bean;

public class CarAdv {
	private String color;
	private static String model;
	public CarAdv() {
	}
	public CarAdv(String color, String model) {
		this.color = color;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "color = " + color + ", model=" + model;
	}
	
}

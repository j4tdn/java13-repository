package shopping;

public class Item {
	private String id;
	private String os;
	private String color;
	private double cost;
	
	public Item() {
	}

	public Item(String is, String os, String color, double cost) {
		this.id = is;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}

	public String getIs() {
		return id;
	}

	public void setIs(String id) {
		this.id = id;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", os=" + os + ", color=" + color + ", cost=" + cost + "]";
	}
	

}

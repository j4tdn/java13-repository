package bean;

public class Apple {
	private int id;
    private String color;
    private double weight;
    private String country;
    
    public Apple() {
    	System.out.println("\n>>>> Apple 00");
	}

    public Apple(int id) {
    	System.out.println("\n>>>> Apple 01");
    	this.id = id;
    }
    
    public Apple(int id, String country) {
    	System.out.println("\n>>>> Apple 02");
    	this.id = id;
    	this.country = country;
    }
    
    
	public Apple(int id, String color, double weight, String country) {
		super();
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + ", weight=" + weight + ", country=" + country + "]";
	}
	
	//Any class
	public static String transfer(Apple apple) {
		return apple.getCountry();
	}
}

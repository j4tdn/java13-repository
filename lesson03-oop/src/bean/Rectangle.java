package bean;
/**
 * 
 * Class Rectangle >> Create some objects
 * 
 * Attributes  : width, height.      
 * ++ order of constructor, getter setter, toString.
 * 1. Empty Constructor
 * 2. Constructor with parameters
 * 3. Getter, Setter
 * 4. toString
 */

public class Rectangle {
	// Attributes
	private int width;
	private int height;
	
	// default empty constructor
	public Rectangle() {
		
	}
	// constructor
	public Rectangle ( int width, int height) {
		this.width = width;
		this.height = height;
	}
	// getter >> get attribute value  
	public int getHeight() {
		return height;
	}
	// setter >> get attribute value
	public void setHeight(int height) {
		this.height = height;
	}

	// getter >> get attribute value  
	public int getWidth() {
		return this.width;
	}
	// setter >> get attribute value
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "with" + this.width + ", height" + this.height;
	}

}

package bean;


/**
 * Class Rectangle >> Create some objects
 * 
 * + attributes: width, height
 * ++ order of constructor, getter setter, toString
 * 1. Empty Constructor
 * 2. Constructor with parameter
 * 3. Getter, Setter
 * 4. ToString
 *
 */
public class Rectangle {
	
	// attribute, values of each object
	private int width;
	private int height;

	// default empty constructor
	public Rectangle() {
		
	}
	
	// constructor
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// getter, setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "w" + this.width + ", h" + this.height;
		
	}
	
}

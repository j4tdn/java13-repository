package bean;

public class Rectangle {
	public int width;
	public int height;
	//default empty constructor
	public Rectangle() {
		
	}
	//constructor
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
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

	public String toString() {
		return "w" + this.width +", h"+this.height;
	}
}

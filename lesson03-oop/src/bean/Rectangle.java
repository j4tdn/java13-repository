package bean;

/**
 * Class Rectangle 
 *
 */
public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {
		
	}
	
	public Rectangle(int pw, int ph) {
		this.width = pw;
		this.height = ph;
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
	
	@Override
		public String toString() {
		return "w " + this.width + ", h " + this.height;
	}
}

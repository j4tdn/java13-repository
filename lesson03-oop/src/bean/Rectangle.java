package bean;

public class Rectangle {
	public int width;
	public int height;
	
	public Rectangle() {
	}
	
	public Rectangle(int width, int height) {
		this.width = width;	
		this.height = height;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "w" + this.width + ", h" + this.height;
	}
}

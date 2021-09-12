package bean;

/**
 * Class Rectangle 
 *
 */
public class Rectangle {
	public int width;
	public int height;
	public Rectangle(int pw, int ph) {
		this.width = pw;
		this.height = ph;
	}
	public Rectangle() {
		
	}
	@Override
		public String toString() {
		return "w " + this.width + ", h " + this.height;
	}
}

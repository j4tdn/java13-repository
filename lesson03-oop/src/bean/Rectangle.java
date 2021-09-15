package bean;

/*
 * Class Rectangle >> Create some objects
 * + attribute: width, height 
 * 
 */
public class Rectangle {
	
	private int width ;
	private int height;
	
	//default constructor
	public Rectangle() {}
	//constructor with parameters
	public Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}

	//getter,setter
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
			// TODO Auto-generated method stub
			return "w:" + this.width + " h:" + this.height;
		}
	
}

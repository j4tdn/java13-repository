package enumeration;

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "("  + this.x + ", " + this.y + ")";
				
	}
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
}

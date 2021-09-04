package enumeration;

public class Point {
	public int x;
	public int y;
	
	public Point(int pX, int pY) {
		this.x = pX;
		this.y = pY;
	}
	@Override
	public String toString() {
		return "(" + this.x + ", "+ this.y + ")";
	}
}

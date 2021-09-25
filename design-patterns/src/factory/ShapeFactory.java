package factory;

public class ShapeFactory {
	
	private ShapeFactory() {
		
	}
	
	public static Shape createRectangel() {
		return new Rectangle();
	}
	public static Shape createSquare() {
		return new Square();
	}
}

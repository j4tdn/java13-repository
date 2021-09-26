package factory;

public class ShapeFactory {
	private ShapeFactory() {
		
	}
public static Shape createRectangle() {
	return new Rectangle();
}
public static Shape createSquare() {
	return new Square();
}
}

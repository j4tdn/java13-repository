package factory;

public class Shapefactory {
	public static Shape createRectangle() {
		return new Rectangle();
	}
	public static Shape createSquare() {
		return new Square();
	}

}

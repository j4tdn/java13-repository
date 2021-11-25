package demo;

import factory.Shape;
import factory.ShapeFactory;

public class App {

	public static void main(String[] args) {
		Shape s1 = ShapeFactory.createRectangle();
		Shape s2 = ShapeFactory.createSquare();

		System.out.println(s1);
		System.out.println(s2);
	}
}

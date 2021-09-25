package demo;

import factory.Shape;
import factory.Shapefactory;
import factory.Shapefactory;

public class App {
	public static void main(String[] args) {
		Shape s1 = Shapefactory.createRectangle();
		Shape s2 = Shapefactory.createSquare();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}

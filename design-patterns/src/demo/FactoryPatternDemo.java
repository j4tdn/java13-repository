package demo;

import factory.Shape;
import factory.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /* Factory Pattern */
        Shape s1 = ShapeFactory.createRectangle();
        Shape s2 = ShapeFactory.createSquare();
        
        System.out.println(s1);
        System.out.println(s2);

        s1.drawing();
        s2.drawing();
    }
}

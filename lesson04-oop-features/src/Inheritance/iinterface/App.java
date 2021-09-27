package Inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Square();
		
		s1.drawing();
		s2.drawing();
		
		/*
		 * Shape s3 = new Shape() {
		 * 
		 * @Override public void drawing() {
		 * System.out.println("Anoymous class >> class >> drawing"); } };
		 */
		Shape s3 = new Anonymous();
		s3.drawing();
	}
}

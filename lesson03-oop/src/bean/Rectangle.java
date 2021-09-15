package bean;
/**
 * Class Rectangle >>Create  some Object
 * 
 * + attributes: width, height;
 * ++ order of constructor, getter, setter
 * 1. Empty constructor
 * 2. constructor with parameter 
 * 3. getter & setter
 * 4. toString
 */


public class Rectangle {
	private int width;
	private int height;
	//default constructor --> khoi tao doi tung --> khoi tao thuoc tinh cho doi tuong
	public Rectangle() {
	
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// getter setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeigh(int height) {
		this.height = height;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "w" + this.width + " ,h"+ this.height;
		}
}


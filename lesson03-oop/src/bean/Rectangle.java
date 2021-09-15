package bean;
/**
 * Class Rectangle >> Create some objects
 * @author Admin
 *+ attributes:width, height
 */
public class Rectangle {
	//attributes
 private int width;
 private int height;
 
//getter,setter
public int getWidth() {
	return this.width;
}
public void setWidth(int width) {
	this.width= width;
}
public int getHeight() {
	return this.height;
}
public void setHeight(int height) {
	this.height= height;
	}
//defaul empty constructor
public Rectangle(int width, int height) 
{
	this.width = width;
	this.height= height;
}
public Rectangle() {
	
}
@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}
//@Override

 
}

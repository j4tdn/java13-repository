package factory;

public class Rectangle extends Shape{
	
	@Override
	void drawing() {
		System.out.println("Rectangle >>  drawing..");
	}
	
	void setBackGround() {
		System.out.println("BackGround: Yellow");
	}
}

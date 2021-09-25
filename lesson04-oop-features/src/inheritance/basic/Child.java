package inheritance.basic;

public class Child extends Parent{
	
	int digit = 20;
	String text = "child";
	
	@Override
	public void log() {
		System.out.println("Child >> logging... ");
	}
}
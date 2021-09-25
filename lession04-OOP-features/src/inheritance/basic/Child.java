package inheritance.basic;

public class Child extends Parent {
	
	int digit = 20;
	String text = "Child";
	
	@Override
	void log() {
		System.out.println("Child >> logging...");
		
	
	}
}

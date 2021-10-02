package inheritance.basic;

// extends Parent, Ancestor > NO
public class Child extends Parent {
	int digit = 20;
	String text = "child";
	
	@Override
	void log() {
		System.out.println("Child >> logging ...");
	}

}

package polymorphism.method;

public class Shape {
	void drawing(){
		System.out.println("Shape >> drawing..");
	}
	
	double calS() {
		return 1;
	}
	
	private void clear() {
		System.out.println("Shape >> clearing...");
	}
}

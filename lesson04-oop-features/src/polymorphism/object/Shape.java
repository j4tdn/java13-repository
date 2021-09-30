package polymorphism.object;

public class Shape {
	void drawing() {
		System.out.println("Shape >> drawing ...");
	}
	
	double calS() {
		// redundant
		return 1;
	}
	
	private void clear() {
		System.out.println("Shape >> clearing ...");
	}
}

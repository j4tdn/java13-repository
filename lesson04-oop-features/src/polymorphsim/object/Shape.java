package polymorphsim.object;

public class Shape {
	void drawing() {
		System.out.println("Shape >> Drawing");
	}
	
	double calS() {
		return 1;
	}
	
	private void clear() {
		System.out.println("Shape >>clear");
	}
}

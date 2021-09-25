package polymophism.object;

public class Shape {
	void drawing(){
		System.out.println("Shape >> drawing");
	}
	
	double claS() {
		// redundant
		return 1;
	}
	
	private void clear() {
		System.out.println("Shape >> clearing ... ");
	}

}

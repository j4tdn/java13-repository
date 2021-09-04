package demo;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		// non static method >> cannot call by class name
		// Ex01TestVM.publicMethod();
		publicEx02Method();
		// initial an instance of Ex01TestVM class
		Ex01TestVM I = new Ex01TestVM();
		I.publicMethod();
	}
	public static void publicEx02Method() {
		System.out.println("Method>> Some text...");
	}
	
}

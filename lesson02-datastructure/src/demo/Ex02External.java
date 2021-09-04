package demo;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		// non static >> cannot call by class name
		
		//Initial an instance of class Ex01TestVM
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
		publicEx02Method();
		
	}
	
	public static void publicEx02Method() {
		System.out.println("Method >> Some text...");
	}
}

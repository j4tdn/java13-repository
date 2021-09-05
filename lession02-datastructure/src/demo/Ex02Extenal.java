package demo;


public class Ex02Extenal {
	public static void main(String[] args) {
		publicEx02Method();
		
		Ex01TestVM.publicStaticMethod();
		
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
		
	}
	
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
	
	public static void main() {
		System.out.println("2nd main");
	}
	
}

package demo;

public class Ex02External {
	public static void main(String[] args) {
		publicEx02Method();	
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicMethod();
	}
	
	
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
}

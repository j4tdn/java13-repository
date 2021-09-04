package demo;

public class Ex02External {
	public static void main(String[] args) {
		Ex01TestVM.publicStaticMethod();
		
		// cannot access private method from outer class
		// Ex01TestVM.privateStaticMethod();
		
		Ex01TestVM instance = new Ex01TestVM();
		instance.publicEx01Method();
		
		publicStaticEx02Method();
	}
	
	//static : OOP >> Class's scope >> Class.staticMethod
	//non-static : Object's scope >> object.nonstaticMethod
	
	public static void publicStaticEx02Method() {
		System.out.println("Method >> Sometext");
	}
	
	
}

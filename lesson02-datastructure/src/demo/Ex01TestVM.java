package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
		//method = function
		//run app = Ctrl + F11 + (Fn)
		System.out.println("Welcome to JAVA13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("==============");
		publicStaticMethod();
		privateStaticMethod();
	}
	
	// Access modifier: public private protected _ (default)
	//void: return type
	
	//static: OOP >> Class's scope >> Class.staticMethod
	//non-static: Object's scope >> object.nonstaticMethod
	
	public static void publicStaticMethod() {
		System.out.println("Method >> publicStaticMethod");		
	}
	
	public void publicMethod() {
		System.out.println("Method >> publicMethod");		
	}
	
	private static void privateStaticMethod() {
		System.out.println("Method >> privateStaticMethod");		
	}
	
	public static void main() {
		System.out.println("Welcome to JAVA13 class!");
	}
}

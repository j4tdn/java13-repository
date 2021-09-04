package demo;

public class Ex02External {
	
	public static void main(String[] args) {
		
		Ex01TestVM.publicStaticMethod();
		
		// cannot access private method from outer class
		// Ex01TestVM.privateStaticMethod()
		
		publicEx02Method();
		
	}
	
	// Method: Camel case >> get, getStudent, getStudentName
	// static: OOP >> Class's scope >> Class.staticMethod
	// non-static : Object's scope >> object.nonStaticMethod
	public static void publicEx02Method() {
		System.out.println("Method >> Some text ...");
	}
}

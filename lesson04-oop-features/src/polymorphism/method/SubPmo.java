package polymorphism.method;

public class SubPmo extends ParentPmo{ // extends~: kế thừa từ cha
	
	// # classes (parent & child relationship)
	// child's method override from parent's child
	// same as method declaration
	
	@Override // annotation, notion (khái niệm, ký hiệu)
	protected String coding() { // method declaration
		// this, super
		// Thuộc phạm vi của đối tượng
		// "this" => chỉ có thể call đối tượng trong Class
		// "super" => có thể call đến đối tượng của cha
		// method body, implementation
		return "C, C++. C#, JAVA";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
}

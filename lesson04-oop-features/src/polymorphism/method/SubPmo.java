package polymorphism.method;

public class SubPmo extends ParentPmo {
	
	// # classes (parent & child relationship)
	// child's method override from parent's child
	// same as method declaration
	
	
	@Override // annotation, notion
	protected String coding() {
		// this, super
		// method body, implementation
		return "C, C++, JAVA, C#";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
}

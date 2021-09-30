package polymorphsim.method;

public class SubPmo extends ParentPmo{
	
	// # classes (parent & child relationship)
	// child's method override from parent's child
	// same as method declaration
	
	
	@Override // annotation, notion
	protected String coding() { // method declaration
		// this, super
		// method body, implementation
		return "C, C++, C#, JAVA";
	}
	
	@Override
	public String toString() {
		return "SubPbo#data";
	}
}

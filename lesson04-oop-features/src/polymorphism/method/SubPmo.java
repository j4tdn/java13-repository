package polymorphism.method;

public class SubPmo extends ParentPmo{
	
	// # classes (parent & child relationship)
	// child's method override from parent's child
	// same as method declaration
	
	
	@Override // annotation, notion
	protected String coding() {	// method declaration
		// this, super
		return "C, C++, C#, Java";
	}
	
	@Override
	public String toString() {
		return "SubPbo#data";
	}
}

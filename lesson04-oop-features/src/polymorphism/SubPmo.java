package polymorphism;

public class SubPmo extends ParentPmo {
	
	// # classes (parent & child relationship)
	// child's method override from parent's method
	// same as method declaration
	
	@Override // annotation, notion
	protected String coding() { // method declaration
		// this, super
		// method body, implementation
		return "C, C++, C#, Java";
	}
	
	@Override
	public String toString() { 
		return "SubPmo#data";
	}
	
	
}

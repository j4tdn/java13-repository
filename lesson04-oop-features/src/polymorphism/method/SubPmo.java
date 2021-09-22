package polymorphism.method;

public class SubPmo extends ParentPmo{
	
	// # class (parent & child relationship)
	// child's method override from parent's child
	// 
	
	// annotation, notion
	@Override
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

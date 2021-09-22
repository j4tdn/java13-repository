package polymorphsim.method;

public class SubPmo extends ParentPmo{

	
	// # classes (parent & child relationship)
	// child's method override from parent's child
	
	
	@Override
	protected String coding() {  //method declaration
		//this, super
		//method body, implementation
		return "C, C++, C#, JAVA";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
}

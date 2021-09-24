package polymophism.method;

public class SubPmo extends ParentPmo{
	
	// # classes (inheritance relationship)
	//child's method override from parent's method
	//same as method declaration
	
	@Override //annotation, notion
	protected String coding() { //method declaration
		//this, super
		//implementation
		return "c, c#, java";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
	
}

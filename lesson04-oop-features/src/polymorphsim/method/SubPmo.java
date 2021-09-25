package polymorphsim.method;

public class SubPmo extends ParentPmo{
	
	//same as method declaration
	@Override //annotation, notion
	protected String coding() { //method declaration
		//this, super
		// method body, implementation
		return "c, C++, C#, JAVA";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
}

package polymorphism.object;

public class SubPmo extends ParentPmo {
	
	// #class (parent & child relationship
	//child's method override from parent
	// same at declaration

	//annotation , notion
	@Override
	protected String coding() { //method declaration
		//this, super
		return "C, C++, C#, java";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
	
}

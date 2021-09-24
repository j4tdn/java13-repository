package polymorphism.method;

public class SubPmo extends ParentPmo {
	
	@Override
	protected String coding() {
		return "C, C++, C#, JAVA";
	}
	
	@Override
	public String toString() {
		return "SubPmo#data";
	}
}

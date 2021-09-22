package polimorphism.method;

public class SubPmo extends ParentPmo{
	public String show() {
		return "SubPbo#data";
	}
	@Override
	public String toString() {
		return "SubPbo#data";		
	}
	@Override
	protected String coding() {
		return "C, C++, C#, Java";
	}
}

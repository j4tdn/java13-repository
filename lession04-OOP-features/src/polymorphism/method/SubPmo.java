package polymorphism.method;

public class SubPmo extends ParenPmo {
	//Override : Class khác nhau nhưng có mỗi quan hệ cha con
	
	//annotation, notion
	
	@Override
	protected String coding() { //methed declaration => giống cha
		// this, super đều thuộc phạm vi của đối tượng
		//method body, implementation
		return "C , C++, C##<, JAVA";
	}
	
	
	
	@Override
	public String toString() {
		return "SubPbo#data";
	}
}

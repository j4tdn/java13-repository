package ex01;

public class Student {
	private String name;
	private int code;
	private float lt;
	private float th;
	public Student() {}
	
	public Student(String name, int code, float lt, float th) {
		this.name = name;
		this.code = code;
		this.lt = lt;
		this.th = th;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getLt() {
		return lt;
	}
	public void setLt(float lt) {
		this.lt = lt;
	}
	public float getTh() {
		return th;
	}
	public void setTh(float th) {
		this.th = th;
	}
	public float getAvg() {
		return(lt+th)/2;
	}
	@Override
	public String toString(){
		return String.format("%-10s%-10d%-10.3f%-10.3f",name,code,lt,th);
	}
}

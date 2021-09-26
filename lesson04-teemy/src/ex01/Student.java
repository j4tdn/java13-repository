package ex01;

public class Student {
	private int id;
	private String name;
	private float DLT;
	private float DTH;
	
	public Student() {
	}
	
	public Student(int id, String name, float dLT, float dTH) {
		this.id = id;
		this.name = name;
		DLT = dLT;
		DTH = dTH;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDLT() {
		return DLT;
	}

	public void setDLT(float dLT) {
		DLT = dLT;
	}

	public float getDTH() {
		return DTH;
	}

	public void setDTH(float dTH) {
		DTH = dTH;
	}
	
	public float DTB(float dlt, float dth) {
		return (dlt+dth)/2;
	}
	
	
	@Override
	public String toString() {
		return "id: "+id+", ten: "+name+", diem ly thuyen: "+DLT+",diem thuc hanh: "+DTH;
	}
	
}

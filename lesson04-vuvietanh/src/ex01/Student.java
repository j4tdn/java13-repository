package ex01;

public class Student {
	private int maSV;
	private String name;
	private float diemLT;
	private float diemTH;
	
	public Student() {
	}

	public Student(int maSV, String name, float diemLT, float diemTH) {
		super();
		this.maSV = maSV;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float diemTB() {
		return (diemLT + diemTH)/2;
	}
	
	@Override
	public String toString() {
		return maSV + "\t" + name + "\t" + diemLT +"\t" + diemTH + "\t" + diemTB();
	}
}

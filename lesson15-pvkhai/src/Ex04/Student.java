package Ex04;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1923855090046964999L;
	
	private String MSSV;
	private String Name;
	private float DTB;
	private String GioiTinh;
	
	public Student() {
		
	}
	
	public Student(String line) {
		String[] elements = line.split(", ");
		this.MSSV = elements[0];
		this.Name = elements[1];
		this.DTB = Float.parseFloat(elements[2]);
		this.GioiTinh = elements[3];
		
	}
	
	public Student(String mSSV, String name, float dTB, String gioiTinh) {
		MSSV = mSSV;
		Name = name;
		DTB = dTB;
		GioiTinh = gioiTinh;
	}

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getDTB() {
		return DTB;
	}

	public void setDTB(float dTB) {
		DTB = dTB;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return "Student [MSSV=" + MSSV + ", Name=" + Name + ", DTB=" + DTB + ", GioiTinh=" + GioiTinh + "]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if( !(obj instanceof Student) ) return false;
		
		Student that = (Student)obj;
		return that.MSSV.equals(that.MSSV);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getMSSV());
	}
	
}

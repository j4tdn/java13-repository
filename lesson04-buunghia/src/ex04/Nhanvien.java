package ex04;

public class Nhanvien extends Person {
	String tendonvi;
	
	public Nhanvien() {}
	public Nhanvien (String name,String birthday,double hsluong,String tendonvi) {
		this.name=name;
		this.birthday=birthday;
		this.hsluong=hsluong;
		this.tendonvi=tendonvi;
	}
	public String getTendonvi() {
		return tendonvi;
	}
	public void setTendonvi(String tendonvi) {
		this.tendonvi = tendonvi;
	}
	public Double getSalary() {
		return (hsluong)*1250000;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("%-25s",tendonvi);
	}
	
}

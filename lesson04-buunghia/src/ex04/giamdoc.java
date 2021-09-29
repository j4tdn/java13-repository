package ex04;

public class giamdoc extends Person {
	Double hschucvu;

	public giamdoc() {}
	public giamdoc (String name,String birthday,double hsluong,double hschucvu) {
		this.name=name;
		this.birthday=birthday;
		this.hsluong=hsluong;
		this.hschucvu=hschucvu;
	}
	public Double getHsChucVu() {
		return hschucvu;
	}
	public void setHschucvu(Double hsChucVu) {
		this.hschucvu = hsChucVu;
	}
	public Double getSalary() {
		return 3000000*(hsluong+hschucvu);
	}
	@Override
	public String toString() {
		return super.toString()+String.format("%15.2f",hschucvu);
	}
	
	
}

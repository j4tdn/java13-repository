package ex04;

public class Truongphong extends Person{
	int soluongnv;
	
	public Truongphong (String name,String birthday,double hsluong,int soluongnv) {
		this.name=name;
		this.birthday=birthday;
		this.hsluong=hsluong;
		this.soluongnv=soluongnv;
	}
	public int getSoluongnv() {
		return soluongnv;
	}
	public void setSoluongnv(int soluongnv) {
		this.soluongnv = soluongnv;
	}
	public Double getSalary() {
		return 2200000*(hsluong);
	}
	@Override
	public String toString() {
		return super.toString()+String.format("%-20d",soluongnv);
	}
}

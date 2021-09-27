package ex04;

public abstract class People {
	private String name;
	private int namSinh;
	private double heSoLuong;
	
	public People() {

	}
	
	public People(String name, int namSinh, double heSoLuong) {
		super();
		this.name = name;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	abstract double salary();

	@Override
	public String toString() {
		return name + "\t" + namSinh + "\t" + heSoLuong ;
	}
	
	
}

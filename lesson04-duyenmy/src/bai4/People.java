package bai4;

public class People {
	protected String name;
	protected int namSinh;
	protected double heSoLuong;
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
	public People(String name, int namSinh, double heSoLuong) {
		super();
		this.name = name;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}

	
}

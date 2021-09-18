package ex01;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double giaXe;
	
	public Vehicle() {
	}

	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double giaXe) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.giaXe = giaXe;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(double giaXe) {
		this.giaXe = giaXe;
	}

	public double tienThue() {
		if(dungTich < 100) {
			return giaXe * 0.01;
		}
		if (dungTich < 200) {
			return giaXe * 0.03;
		}
		return giaXe * 0.05;
	}
	@Override
	public String toString() {
		return tenChuXe + "\t" + loaiXe + "\t" + dungTich + "\t" + giaXe + "\t" + tienThue();
	}
	
}

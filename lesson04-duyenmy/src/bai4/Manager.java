package bai4;

public class Manager extends People {
	private int soLuongNVQL;

	public Manager(String name, int namSinh, double heSoLuong, int soLuongNVQL) {
		super(name, namSinh, heSoLuong);
		this.soLuongNVQL = soLuongNVQL;
	}

	public int getSoLuongNVQL() {
		return soLuongNVQL;
	}

	public void setSoLuongNVQL(int soLuongNVQL) {
		this.soLuongNVQL = soLuongNVQL;
	}

	@Override
	public String toString() {
		return "Manager [  Name=" + name + ", Năm Sinh=" + namSinh + ", Hệ Số Lương="
				+ heSoLuong +", Số lượng nhân viên quản lí=" + soLuongNVQL + "]";
	}
	public double luong() {
		 return this.heSoLuong*2200000;
	 }

}

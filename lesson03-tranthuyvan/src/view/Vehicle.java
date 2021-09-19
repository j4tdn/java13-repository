package view;
/**
 * Dựa vào thông tin trị giá xe và dung tích xylanh, tính mức thuế phải đóng trước bạ
 * Dưới 100cc => 1% trị giá xe 
 * Từ 100 đến 200cc => 3% trị giá xe
 * Trên 200cc => 5% trị giá xe
 */

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	private double thue;
	
	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.thue = tinhThue();
	}
	private double tinhThue() {
		if (this.dungTich < 100) {
			return this.triGia * 0.01;
		}
		if (this.dungTich >= 100 && this.dungTich <= 200) {
			return this.triGia * 0.03;
		}
			return this.triGia * 0.05;
		
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
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public void printInfomation() {
		System.out.println("Ten chu xe: " + this.getTenChuXe());
		System.out.println("Loai xe: " + this.getLoaiXe());
		System.out.println("Dung tich xe: " + this.getDungTich());
		System.out.println("Tri gia xe: " + this.getTriGia());
		System.out.println("Thue: " + this.getThue());
	}
	

}

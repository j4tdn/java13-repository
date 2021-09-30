package ex04;

import java.time.LocalDate;

public class NhanVien extends People {
	
	private String tenDonVi ;
	
	public NhanVien() {
		
	}
	public NhanVien(String name, String date, int luong, String ten) {
		super(name,date, luong);
		
		this.tenDonVi = ten;
	}
	
	public int calSalary() {
		return this.heSoLuong * 1250000;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "truong phong: "+ name + "\n"
		+"ngay sinh: " + date + "\n" 
		+"he so luong: "+ heSoLuong + "\t ten don vi: " + tenDonVi+ "\n"
		+"luong: " + calSalary() +"\n"+ "============================== \n";
	}

	
}
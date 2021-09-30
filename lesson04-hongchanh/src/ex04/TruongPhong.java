package ex04;

import java.time.LocalDate;

public class TruongPhong extends People {

	private int employees ;
	
	public TruongPhong() {
		
	}
	public TruongPhong(String name , String date, int luong, int e) {
		
		super(name, date, luong);
		
		this.employees = e;
	}
	
	public int calSalary() {
		return this.heSoLuong * 2200000;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "truong phong: "+ name + "\n"
		+"ngay sinh: " + date + "\n" 
		+"he so luong: "+ heSoLuong + "\t so nhan vien quan ly: " + employees+ "\n"
		+"luong: " + calSalary() +"\n"+ "============================== \n";
	}

}
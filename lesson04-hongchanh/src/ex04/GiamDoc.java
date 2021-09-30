package ex04;

import java.time.LocalDate;

public class GiamDoc extends People {

	private int heSoChucVu ;
	
	public GiamDoc() {
		
		
	}
	public GiamDoc(String name , String date, int luong, int heSoChucVu) {
		
		super(name ,date, luong);
		
		this.heSoChucVu = heSoChucVu;
		
		
	}
	
	public int getHeSoChucVu() {
		return heSoChucVu;
	}
	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
	public int calSalary() {
		return ( this.heSoLuong + this.heSoChucVu) * 3000000;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Giam doc: "+ name + "\n"
				+"ngay sinh: " + date + "\n" 
				+"he so luong: "+ heSoLuong + "\t he so chuc vu: " + heSoChucVu+ "\n"
				+"luong: " + calSalary()+ "\n" +"============================== \n";
	}
	
}
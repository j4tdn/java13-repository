package bai4;

public class Employee extends People {
	private String tenDonVi;
	
	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public Employee(String name, int namSinh, double heSoLuong, String tenDonVi) {
		super(name, namSinh, heSoLuong);
		this.tenDonVi = tenDonVi;
	}

	@Override
	public String toString() {
		return "Employee ["+" Name="+name+", Năm sinh="+namSinh+", Hệ số lương="+heSoLuong+", tenDonVi=" + tenDonVi + "]";
	}

	
	public double luong() {
		 return this.heSoLuong*3000000;
	 }
	

	

}

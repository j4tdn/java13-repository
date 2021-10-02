package ex05;

public class Khachhang {
	private String ma;
	private String ten;
	private String sdt;
	private String diachi;
	
	public Khachhang() {
		
	}
	
	public Khachhang(String ma, String ten, String sdt, String diachi) {
		this.ma=ma;
		this.ten=ten;
		this.sdt=sdt;
		this.diachi=diachi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
	
	

}

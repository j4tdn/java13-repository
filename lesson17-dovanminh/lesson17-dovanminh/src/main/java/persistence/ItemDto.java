package persistence;

public class ItemDto {
	private int maLoai;
	private String tenLoai;
	private int maMh;
	private String tenMh;
	private int giaBan;
	private int giaMua;
	private int soLuong;
	public ItemDto() {
		
	}
	public ItemDto(int maLoai, String tenLoai, int maMh, String tenMh, int giaBan, int giaMua, int soLuong) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.maMh = maMh;
		this.tenMh = tenMh;
		this.giaBan = giaBan;
		this.giaMua = giaMua;
		this.soLuong = soLuong;
	}
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public int getMaMh() {
		return maMh;
	}
	public void setMaMh(int maMh) {
		this.maMh = maMh;
	}
	public String getTenMh() {
		return tenMh;
	}
	public void setTenMh(String tenMh) {
		this.tenMh = tenMh;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public int getGiaMua() {
		return giaMua;
	}
	public void setGiaMua(int giaMua) {
		this.giaMua = giaMua;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "ItemDto [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", maMh=" + maMh + ", tenMh=" + tenMh
				+ ", giaBan=" + giaBan + ", giaMua=" + giaMua + ", soLuong=" + soLuong + "]";
	}
	
	
}

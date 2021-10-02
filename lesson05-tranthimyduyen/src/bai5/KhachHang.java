package bai5;

public class KhachHang {
private int MKH;
private String Name;
private String Phone;
private String Address;
public KhachHang() {};
public KhachHang(int mKH, String name, String phone, String address) {
	super();
	MKH = mKH;
	Name = name;
	Phone = phone;
	Address = address;
}
public int getMKH() {
	return MKH;
}
public void setMKH(int mKH) {
	MKH = mKH;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "KhachHang [MKH=" + MKH + ", Name=" + Name + ", Phone=" + Phone + ", Address=" + Address + "]";
}

}

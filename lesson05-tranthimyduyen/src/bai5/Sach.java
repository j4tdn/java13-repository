package bai5;

public class Sach {
protected String Masach; // sai convention hết VD: maSach hoặc bookId
protected double Dongia;
protected String NXB;
public Sach() {}
public Sach(String masach, double dongia, String nXB) {
	super();
	Masach = masach;
	Dongia = dongia;
	NXB = nXB;
}
public String getMasach() {
	return Masach;
}
public void setMasach(String masach) {
	Masach = masach;
}
public double getDongia() {
	return Dongia;
}
public void setDongia(double dongia) {
	Dongia = dongia;
}
public String getNXB() {
	return NXB;
}
public void setNXB(String nXB) {
	NXB = nXB;
}

}

package bai1;

public class SinhVien {
private int MSV;
private String NameSV;
private double DiemLT;
private double DiemTH;


public SinhVien() {}

public SinhVien(int mSV, String nameSV, double diemLT, double diemTH) {
	super();
	MSV = mSV;
	NameSV = nameSV;
	DiemLT = diemLT;
	DiemTH = diemTH;
}

public int getMSV() {
	return MSV;
}

public void setMSV(int mSV) {
	MSV = mSV;
}

public String getNameSV() {
	return NameSV;
}

public void setNameSV(String nameSV) {
	NameSV = nameSV;
}

public double getDiemLT() {
	return DiemLT;
}

public void setDiemLT(double diemLT) {
	DiemLT = diemLT;
}

public double getDiemTH() {
	return DiemTH;
}

public void setDiemTH(double diemTH) {
	DiemTH = diemTH;
}

@Override
public String toString() {
	return "SinhVien [MSV=" + MSV + ", NameSV=" + NameSV + ", DiemLT=" + DiemLT + ", DiemTH=" + DiemTH + "]";
}



}

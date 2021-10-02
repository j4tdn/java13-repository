package bai5;

public class SachGK extends Sach{
private boolean Tinhtrang;

public SachGK(String masach, double dongia, String nXB, boolean tinhtrang) {
	super(masach, dongia, nXB);
	Tinhtrang = tinhtrang;
}

public boolean isTinhtrang() {
	return Tinhtrang;
}

public void setTinhtrang(boolean tinhtrang) {
	Tinhtrang = tinhtrang;
}

@Override
public String toString() {
	return "SachGK [Tinhtrang=" + Tinhtrang + "]";
}



}

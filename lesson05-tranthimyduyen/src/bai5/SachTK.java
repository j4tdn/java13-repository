package bai5;

public class SachTK extends Sach{
private double Thue;

public SachTK(String masach, double dongia, String nXB, double thue) {
	super(masach, dongia, nXB);
	Thue = thue;
}

public double getThue() {
	return Thue;
}

public void setThue(double thue) {
	Thue = thue;
}

@Override
public String toString() {
	return "SachTK [Thue=" + Thue + "]";
}

}

package homework;

public class Vehicle {
	private int dungTich;
    private double triGia;
    private String chuXe,loaiXe;
 
    public Vehicle( int dungTich, double triGia, String chuXe, String loaiXe) {
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.loaiXe=loaiXe;
    }
    public Vehicle(){
 
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getLoaiXe() {
        return loaiXe;
    }
 
    public void setLoaiXe(String loaiXe) {
        this.loaiXe=loaiXe;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
    @Override
    public String toString() {
        return chuXe + "-"+loaiXe + "-"+triGia + "-"+dungTich;
}
 
    void inThue(){
        System.out.printf(" %-20s  %-20s  %-20d  %-20.2f  %-18.5f\n ",chuXe,loaiXe,dungTich,triGia,tinhThue());
    }

}

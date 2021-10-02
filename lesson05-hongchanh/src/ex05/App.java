package ex05;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sachgk s1= new Sachgk("SGK1",150,"kim dong",true);
		Sachgk s2= new Sachgk("SGK2",40,"nhi dong",true);
		Sachgk s3= new Sachgk("SGK3",30,"nhi dong",false);
		
		Sachtk s4= new Sachtk("SGK1",175,"kim dong",3);
		Sachtk s5= new Sachtk("SGK2",70,"kim dong",2);
		
		Sach[] a = {s1,s2,s3,s4,s5};
		
		nhidong(a);
		gia50(a);
		gk100(a);
		
	}
	
	public static void nhidong (Sach[] a) {
		System.out.println("sach nxb nhi dong");
		for (int i=0; i<a.length ; i++) {
			if(a[i].getNxb()== "nhi dong") {
			System.out.println(a[i].toString());	
			}
		}
		System.out.println("===========================");
		
	}
	
	public static void gia50 (Sach[] a) {
		System.out.println("sach don gia nho hon 50");
		for (int i=0; i<a.length ; i++) {
			if(a[i].getDongia()< 50) {
			System.out.println(a[i].toString());	
			}
		}
		System.out.println("===========================");
		
	}
	
	public static void gk100 (Sach[] a) {
		System.out.println("sach gk 100-200");
		for (int i=0; i<a.length ; i++) {
			if(a[i].getDongia()>=100 && a[i].getDongia()<=200) {
			System.out.println(a[i].toString());	
			}
		}
		System.out.println("===========================");
		
	}

}

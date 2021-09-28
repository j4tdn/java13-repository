package bai4;

public class QLNS {
public static void main(String[] args) {
	Director gd1 = new Director("Nguyễn Văn A",1990,5,1.5);
	Manager ql1= new Manager("Trần Văn B",1994,4,20);
	Employee nv1=new Employee("Phan Văn C",1997,3,"Phòng Nhân Sự");
	Employee nv2=new Employee("Đoàn Văn D",1999,3,"Phòng Marketing");
	System.out.println("Thông tin nhân sự: ");
	System.out.println(gd1.toString());
	System.out.println(ql1.toString());
	System.out.println(nv1.toString());
	System.out.println(nv2.toString());
	
	System.out.println("Lương của giám đốc "+gd1.getName()+" là: "+gd1.luong());
	System.out.println("Lương của quản lí "+ql1.getName()+" là: "+ql1.luong());
	System.out.println("Lương của nhân viên "+nv1.getName()+" là: "+nv1.luong());
	System.out.println("Lương của nhân viên "+nv2.getName()+" là: "+nv2.luong());
	
}
}

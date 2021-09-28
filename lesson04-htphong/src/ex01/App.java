package ex01;
import java.util.*;
public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Student sv1 = new Student(123,"Huynh Thanh Phong", 8.5f, 9.0f);
		Student sv2 = new Student(124,"Ho Van Y", 8.7f, 9.2f);
		System.out.println("Nhap thong tin sinh vien 3: ");
		Student sv3 = new Student();
		System.out.print("Nhap mssv: ");
		sv3.setId(Integer.parseInt(input.nextLine()));
		System.out.print("Nhap ho va ten: ");
		sv3.setName(input.nextLine());
		System.out.print("Nhap diem Lt: ");
		sv3.setLt(input.nextFloat());
		System.out.print("Nhap diem TH: ");
		sv3.setTh(input.nextFloat());
		
		System.out.println("Diem tren 8.5: ");
		Student[] a = {sv1, sv2, sv3};
		for (int i = 0 ; i<a.length;i++) {
			average(a[i]);
		}
		
		System.out.println("Diem LT lon hon TH: ");
		for (int i = 0 ; i<a.length;i++) {
			compareMark(a[i]);
		}
	}
	
	public static void average(Student student) {
		double aver = (student.getLt() + student.getTh())/2;
		if (aver > 8.5){
			System.out.println(student.toString()+" ,average: "+aver);
		}
	}
	
	public static void compareMark(Student student) {
		if (student.getLt() > student.getTh()){
			System.out.println(student.toString());
		}
	}
}

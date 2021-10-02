package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Dong", 9, 9);
		Student sv2 = new Student(2, "Tay", 9, 8);
		
		Student sv3 = new Student();
		enterStudentInfo(sv3);
		
		Student[] studentArray = {sv1, sv2, sv3};  
		
		getStudentWithAveragePointBiggerThan(studentArray, 8.5f);
		System.out.println("====================================================");
		getStudentWithPointLTBiggerThanPointTH(studentArray);
	}
	
	public static void enterStudentInfo(Student sv) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Student Id: ");
		sv.setId(Integer.parseInt(ip.nextLine()));
		
		System.out.println("Enter Student Name: ");
		sv.setName(ip.nextLine());
		
		System.out.println("Enter Student PointLT: ");
		sv.setPointLT(Float.parseFloat(ip.nextLine()));
		
		System.out.println("Enter Student PointTH: ");
		sv.setPointTH(Float.parseFloat(ip.nextLine()));
	}
	
	public static ArrayList<Student> getStudentWithAveragePointBiggerThan(Student[] sv, float point) {
		ArrayList<Student> studentResult = new ArrayList<Student>();
		
		for(int i = 0; i < sv.length; i++) {
			if (sv[i].getAveragePoint() > point) {
				studentResult.add(sv[i]);
			}
		}
		
		System.out.println("Students with average point > " + point + ": ");
		studentResult.forEach(student ->{
            System.out.println(student);
        });
		
		return studentResult;
	}
	
	public static ArrayList<Student> getStudentWithPointLTBiggerThanPointTH(Student[] sv) {
		ArrayList<Student> studentResult = new ArrayList<Student>();
		
		for(int i = 0; i < sv.length; i++) {
			if (sv[i].getPointLT() > sv[i].getPointTH()) {
				studentResult.add(sv[i]);
			}
		}
		
		System.out.println("Students with PointLT Bigger Than PointTH: ");
		studentResult.forEach(student ->{
            System.out.println(student);
        });
		
		return studentResult;
	}
}

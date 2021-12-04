package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectSort {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập số sinh viên trong lớp: \n");
	int n=Integer.parseInt(input.nextLine());
	Student[] st=  new Student[n];
	for(int i=0;i<n;i++) {
		System.out.println("Nhập thông tin sinh viên thứ "+i);
		System.out.println("Nhập tên sv"+i);
		String name=input.nextLine();
		System.out.println("Nhập tuổi sv"+i);
		int age=Integer.parseInt(input.nextLine());
		st[i]= new Student(i,name,age);
	}
	show(st);
	Arrays.sort(st);
	System.out.println("=================Sắp xếp tăng dần theo tuổi===============");
	show(st);
	Arrays.sort(st,Student.StudentName);
	System.out.println("=================Sắp xếp tăng dần theo tên================");
	show(st);
}
public static void show(Student[] st) {
	System.out.println("Danh sach sinh viên");
	for(int i=0;i<st.length;i++) {
		System.out.println("Sinh viên "+st[i].getId()+"-Tên: "+st[i].getName()+"-Tuổi :"+st[i].getAge());
	}
}
}

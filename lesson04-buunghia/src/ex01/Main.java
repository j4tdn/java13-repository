package ex01;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	ArrayList <Student> studentList= new ArrayList<>();
	Student sv1= new Student("Nghia",1,8f,9f);
	Student sv2= new Student ("Phu",2,6.5f,8f);
	Student sv3= new Student();
	System.out.print("Enter student name:");
	sv3.setName(sc.nextLine());
	System.out.print("Enter student code:");
	sv3.setCode(inputInt());
	System.out.print("Enter student LT point:");
	sv3.setLt(inputFloat());
	System.out.print("Enter student TH point:");
	sv3.setTh(inputFloat());
	studentList.add(sv1);
	studentList.add(sv2);
	studentList.add(sv3);
	System.out.println("Student with average point greater than 8.5:");
	printList(searchStudentByAvg(studentList,8.5f));
	System.out.println("Student with LT point higher than TH point");
	printList(searchStudentByPoint(studentList));
}
public static int inputInt() {
	while(true) {
		try {
			int result=Integer.parseInt(sc.nextLine());
			return result;
		}catch(NumberFormatException e) {
			System.out.println("You must input an integer:");
			System.out.print("Enter again:");
		}
	}
}
public static float inputFloat() {
	while(true) {
		try {
			float result=Float.parseFloat(sc.nextLine());
			return result;
		}catch(NumberFormatException e) {
			System.out.println("You must input a float number:");
			System.out.print("Enter again:");
		}
	}
}
public static void printList(ArrayList<Student> studentList) {
	System.out.println(String.format("%-10s%-10s%-10s%-10s","Name","Code","LT","TH"));
	for (Student student:studentList) {
		System.out.println(student.toString());
	}
}
public static ArrayList<Student> searchStudentByAvg(ArrayList<Student> studentList,float avg){
	ArrayList<Student> list = new ArrayList<>();
	for (Student student:studentList) {
		if(student.getAvg()>=avg) list.add(student);
	}
	return list;
}
public static ArrayList<Student> searchStudentByPoint(ArrayList<Student> studentList){
	ArrayList<Student> list = new ArrayList<>();
	for (Student student:studentList) {
		if (student.getLt()>student.getTh()) list.add(student);
	}
	return list;
}
}

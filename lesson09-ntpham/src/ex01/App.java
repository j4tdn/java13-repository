package ex01;
import static ex01.StudentUtils.*;

public class App {
	
	public static void main(String[] args) {
		
		Student[] students =  intialListStudents();
		
		System.out.println("List student had getted rank A in year 2021: ");
		showListStudents(getListStudentsHaveRankedA(students));
		
		System.out.println("===========================================");
		System.out.println("List student had studied again data structure subject in year 2021: ");
		showListStudents(getListStudentsStudyAgain(students));
	}
	
}

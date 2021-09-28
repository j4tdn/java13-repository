package ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Students sv1 = new Students(123, "tran thi bao quyen", 8.5f, 9f);
		Students sv2 = new Students(123, "tran thi quynh nhu", 7.5f, 7f);
		Students sv3 = new Students();
		sv3 = StudentUtils.inputInfor();
		Students [] sv = {sv1,sv2,sv3};
		StudentUtils.avgPointOver85(sv);;
		StudentUtils.theoryIsBetterThanPractice(sv);
		
	}
	
	
}

package ex03;

import java.util.Scanner;

import ex04.Student;

public class Ex03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhập số phần tử của mảng: \n");
	int n=Integer.parseInt(input.nextLine());
	String[] st=  new String[n];
	for(int i=0;i<n;i++) {
		System.out.println("Nhập phần tử thứ "+i);
		st[i]= input.nextLine();
	}
	String[] kq=compare(st);
	show(kq);
}
public static void show(String[] st) {
	System.out.println("Danh sách các phần tử của mảng");
	for(int i=0;i<st.length;i++) {
		System.out.println("Phần tử thứ "+i+" là "+st[i]);
	}
}
public static String[] compare(String[] st) {
	String[] result= st;
	int count=0;
	for(int i=0;i<result.length;i++) {
		if(result[i]=="special"||result[i]=="Special") {
			String temp=result[count];
			result[count]=result[i];
			result[i]=temp;
			count++;
		}
	}
	for(int i=count;i<result.length;i++) {
		if(Integer.parseInt(result[i])<0) {
			String temp=result[count];
			result[count]=result[i];
			result[i]=temp;
			count++;
		}
	}
	for(int i=count;i<result.length;i++) {
		if(Integer.parseInt(result[i])>=0) {
			String temp=result[count];
			result[count]=result[i];
			result[i]=temp;
			count++;
		}
	}
	return result;
}
}

package ex02;
import java.util.Random;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		
		System.out.print("Input array size:");
		int n=ex01.Main.inputInt();
		ArrayList<Integer> list = new ArrayList<>(); 
		rndArray(list,n);
		System.out.println("Unsorted array:");
		displayArray(list);
		System.out.println("Sorted array:");
		displayArray(sortArray(list));
		
	}
	public static void rndArray(ArrayList<Integer> list,int n) {
		Random rd=new Random();
		for (int i=0;i<n;i++) {
			list.add(rd.nextInt(100));
		}
	}
	public static void displayArray(ArrayList<Integer> list) {
		System.out.print("[");
		for (int i=0;i<list.size()-1;i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println(list.get(list.size()-1)+"]");
	}
	public static ArrayList<Integer> sortArray (ArrayList<Integer> list) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i:list) {
			if (i%7==0&&i%5!=0) arr.add(i);
		}
		for (int i:list) {
			if (!(i%7==0^i%5==0)) arr.add(i);
		}
		for (int i:list) {
			if (i%5==0&&i%7!=0) arr.add(i);
		}
		return arr;
	}
}

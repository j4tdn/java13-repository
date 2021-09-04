package data;

import bean.Digit;

public class Ex11 {
	public static void main(String[] args) {
		Integer i1= 10;
		Integer i2= 20;
		swap(i1,i2);
		System.out.println("i1 = " + i1 + ", i2 = " + i2);
		Digit d1 = new Digit(10);
		Digit d2 = new Digit(20);
		swap(d1,d2);
		System.out.println("d1 = " + d1.value + ", d2 = " + d2.value);
	}
	public static void swap(Digit first, Digit second) {
		int tmp = first.value;
		first.value = second.value;
		second.value = tmp;
	}
	public static void swap(Integer first, Integer second) {
		Integer tmp = first;
		first = second;
		second = tmp;
	}
}

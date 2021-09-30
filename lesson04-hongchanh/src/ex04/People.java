package ex04;

import java.time.LocalDate;

public class People {
	
	protected String name ;
	protected LocalDate date;
	protected int heSoLuong ;
	
	public People() {
		
	}
	public People(String name , String date, int heSoLuong) {
		
		String[] b = date.split(" ");
		
		int d= Integer.parseInt(b[0]);
		int m= Integer.parseInt(b[1]);
		int y= Integer.parseInt(b[2]);
		
		this.name = name ;
		this.date = LocalDate.of(y, m, d) ;
		this.heSoLuong = heSoLuong;
		
	}
	
	
	public String getName() {
		return this.name ;
	}
	public void setName(String name ) {
		this.name = name ;
	}
	
	public LocalDate getDate() {
		return this.date;
		
	}
	
	public void setDate(String date) {
		String[] b = date.split(" ");
		
		int d= Integer.parseInt(b[0]);
		int m= Integer.parseInt(b[1]);
		int y= Integer.parseInt(b[2]);
		
		this.date = LocalDate.of(y, m, d) ;
	}
	
	public int getHeSoLuong() {
		return this.heSoLuong;
	}
	public void setHeSoLuong(int luong) {
		this.heSoLuong = luong;
	}
	
	public int calSalary() {
		return 0;
	}
	
	
	
}
package view;

import view.Ex02;

public class Ex02 {
	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		long total = ex.giaiThua(4) + ex.giaiThua(7) + ex.giaiThua(12) + ex.giaiThua(18);
		System.out.println("Ket qua: " + total);
	}
	
	public long giaiThua(int number) {
		long result = 1;
		for (long i = 1; i <= number; i++)
		{
			result *= i;
		}
		return result;
		
	}

}

package view;

import view.Ex04;

public class Ex04 {
	public static void main(String[] args) {
		Ex04 h = new Ex04();
		 int[] numberArr = { 12, 1, 10, 4, 3, 71, 6, 16 };
	       int max = 0;
	       for(int i : numberArr) {
	           System.out.println(i);
	           if(i % 2 != 0 && max < i) 
	        	   max = i;
	       }
	       System.out.println("so le lon nhat la " + max);
	     }
	
}

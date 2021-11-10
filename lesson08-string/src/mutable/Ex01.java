package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		// immutable & mutable 
		
		
		// immutable >> String Literal >> constant pool
		String i = "Box";
		JvmUtils.hash("i", i);
		
		i = i + " Layout !";
		JvmUtils.hash("i", i);
		System.out.println("=============");
		
		// mutable >> StringBuilder || StringBuffer >> normal heap
		StringBuilder m = new StringBuilder("Builder");
		// StringBuffer m = new StringBuffer; // ko hay dùng StringBuffer
		
		m.append(" Pattern") // add
		 .append(" Java");
		JvmUtils.hash("m", m);
		
	}

}

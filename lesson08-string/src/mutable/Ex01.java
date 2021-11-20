package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		// immutable & mutable
		
		// immutable >> String Literal >> constant pool 
		String i = "Box";
		JvmUtils.hash("i", i);
		
		i = i.concat(" Layout !");
		JvmUtils.hash("i", i);
		
		System.out.println("============");
		
		// mutable >> StringBuilder || StringBuffer >> normal heap
		StringBuilder m = new StringBuilder("Builder");
		// StringBuffer m = new StringBuffer("Builder");
		JvmUtils.hash("m", m);
		
		m.append(" Pattern")
		 .append(" Java");
		JvmUtils.hash("m", m);
	}
}

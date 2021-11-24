package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		//Immutable & mutable
		
		//Immutable >> String >> Literal  constant pool
		String i = "Box";
		JvmUtils.hash("i", i);
		
		i = i.concat(" Layout");
		JvmUtils.hash("i", i);
		
		System.out.println("==========================");
		
		//mutable >> StringBuilder , String || StringBuffer
		StringBuilder m = new StringBuilder("StringBiulder");
		//StringBuffer m = new StringBuffer("StringBiulder");
		JvmUtils.hash("m", m);
		
		m.append(" Pattern")
		 .append(" Java");
		JvmUtils.hash("m", m);
	}
}

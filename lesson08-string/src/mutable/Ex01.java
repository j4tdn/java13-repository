package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		//immutable vs mutable
		
		// immutable >> constant poll
		String i = "Box";
		JvmUtils.hash("i", i);
		
		i = i + " Layout !";
		JvmUtils.hash("i", i);
		
		// mutable >> StringBuilder || StringBuffer
		StringBuilder m = new StringBuilder("Singleton");
		System.out.println("m: " + m.toString());
		JvmUtils.hash("m", m);
		
		m.append(" Patter")
		 .append(" Java");
		
		JvmUtils.hash("m", m);
		System.out.println();
	}
}

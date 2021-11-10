package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		// immutable & mutable
		
		// immutable >> constant pool
		String i = "Box";
		JvmUtils.hash("i: ", i);
		
		i = i + "Layout ! ";
		JvmUtils.hash("i", i);
		
		// mutable >> StringBuilder || StringBuffer
		StringBuilder m = new StringBuilder("Builder");
		JvmUtils.hash("m: ", m);
		
		m.append("Pattern")
		 .append("Java");
		JvmUtils.hash("m", m);
	}
}

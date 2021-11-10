package mutable;

import utils.JVMUtils;

public class Ex01 {
	public static void main(String[] args) {
		//immutable & mutable
		
		//immutable >> constant pool
		String i = "Box";
		JVMUtils.hash("i", i);
		
		i = i + " Layout !";
		JVMUtils.hash("i", i);
		
		//mutable >> StringBuilder || StringBuffer >> normal heap
		StringBuilder m = new StringBuilder("Java");
		JVMUtils.hash("m", m);
		
		m.append(" Web")
			.append(" Developer");
		JVMUtils.hash("m", m);
		System.out.println(m);
		
	}
}

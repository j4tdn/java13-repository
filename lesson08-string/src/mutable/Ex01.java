package mutable;

import utils.JVMUtils;

public class Ex01 {
	
	public static void main(String[] args) {
		// immutable && mutable
		
		// immutable >> String Literal constant pool
		String i = "Box";
		JVMUtils.has("i", i);
		
		i = i + " Layout !";
		JVMUtils.has("i", i);
		
		System.out.println("=================");
		
		// Mutable >> StringBuilder || StringBuffer >> normal heap
		// StringBuilder m = new StringBuilder("Builder");
		StringBuffer m = new StringBuffer("Buffer");
		JVMUtils.has("m", m);
		m.append(" Pattern").append(" Java");
		JVMUtils.has("m", m);
	}
}

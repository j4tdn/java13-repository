package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		// immutable & mutable
		
		//immutable
		String i= "Box";
		JvmUtils.hash("i", i);
		
		i=i.concat("layout !");
		JvmUtils.hash("i", i);
		
		//mutable>> StringBuilder||StringBuffer
		StringBuilder m = new StringBuilder();
		JvmUtils.hash("m",m);
		
		m.append("Pattern")
		.append(" java");
		JvmUtils.hash("m", m);
		
	}
}

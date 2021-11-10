package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		//immutable & mutable
		
		//immutable >> string literal
		String i = "Box";
		JvmUtils.hash("i", i);
		i = i.concat("layOut !");
		JvmUtils.hash("i", i);
		
		// mutable >> StringBiuder || StringBuffer
		StringBuilder m = new StringBuilder("Singleton");
		JvmUtils.hash("m",m);
		m.append("java");
		m.append("Buider");
		
		JvmUtils.hash("m",m);
		
	}
}

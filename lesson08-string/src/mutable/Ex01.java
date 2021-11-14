package mutable;

import utils.JvmUtils;

public class Ex01 {
	public static void main(String[] args) {
		String i = "box";
		JvmUtils.hash(i, i);
		
		i = i.concat(" Layout !");
		JvmUtils.hash("i", i);
		
		System.out.println("=========");
		
		//StringBuilder m = new StringBuilder("Singleton");
		StringBuffer m = new StringBuffer("Singleton");
		JvmUtils.hash("m", m);
		
		m.append(" Pattern")
		 .append(" java");
		JvmUtils.hash("m", m);
		
	}
}

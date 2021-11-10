package mutable;

import utils.JvmUtils;

public class Ex01 {
public static void main(String[] args) {
	//immutable
	String i="Box";
	JvmUtils.hash("i",i);
	
	i=i.concat("Layout !");
	JvmUtils.hash("i", i);
	
	//multable 
	StringBuilder m =  new StringBuilder("Builder");
	JvmUtils.hash("m", m);
	
	m.append("Pattern").append("Java");
	JvmUtils.hash("m", m);
	
	
}
}

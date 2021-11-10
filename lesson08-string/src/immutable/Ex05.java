package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String  s="STK123";
		String s1="STK";
		String s2="SGK";
		
		String s3="  Welcome to our   class  ";
		System.out.println("start with STK: "+s.startsWith(s1));
		System.out.println("end with STK : "+s.endsWith(s1));
		System.out.println("after replace : "+s.replace(s1, s2));
		System.out.println("after replace s: "+s);
		// \s:space
		//' ':space
		//+:1 or n characters
		//{1, }:1 or n characters
		//{a,b}:form a to b character
		System.out.println("remove redundant spaces:|||"+s3.trim().replaceAll("[\\s]+", "-")+"|||");
		
		String s4=s.substring(4);
		System.out.println("s4 substring: "+s4);
		String s5 = s.substring(0, 4);
		System.out.println("s5 sub(0,4) : "+s5);
		
		System.out.println("s contains s1 ? "+s.contains(s1));
		System.out.println("s contains s2 ? "+s.contains(s2));
		
	}
}

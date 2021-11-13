package ex03;

import java.util.Scanner;

public class Revert {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
    System.out.println("Nhap vo chuoi");
    String s=sc.nextLine();
   revert(s);
}
public static void revert(String s) {
	s=s.replaceAll("\\s\\s+", " ").trim();
    String res[]=s.split(" ");
    String result="";
    
    for (String re : res) {
        System.out.println(re);
        String reverse = new StringBuffer(re).
         reverse().toString();
       result+=" "+reverse;
    }
    result.trim();
}
}

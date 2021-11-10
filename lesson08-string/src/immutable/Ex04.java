package immutable;

public class Ex04 {
public static void main(String[] args) {
	String s ="Grid";
	String s1= "Layout";
	//1.Tính chiều dài của chuỗi s
	int a = s.length();
	int b = s1.length();
	//2.Nối chuỗi
	s=s+s1;
	//String s =s.concat(s1);
	//3.Lấy một ký tự tại vị trí index(3) trong chuỗi s
    char k= s.charAt(3);
    //4.Duyệt từng phần tử trong chuỗi
    for(int i=0 ;i<=s.length();i++) {
    	System.out.println(s.charAt(i));
    }
    //5.in ra vị trí đầu và cuối của 1 kí tự
    System.out.println("First 'a' position: "+s.indexOf(a));
    System.out.println("Last 'a' position: " + s.lastIndexOf(a));
    


}
}

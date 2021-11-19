package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "cháNh@@ Ngu$%yễN35    hỒnG1";
		task(name);
	}
	
	public static void task(String a) {
		
		System.out.print("chuỗi lúc đầu : ");
		System.out.println(a);
		
		System.out.print("chuỗi bỏ số, ký tự đặc biệt : ");
		a = a.trim().replaceAll("[0-9~!@#$%^&*]+", "");
		System.out.println(a);
		
		System.out.print("chuỗi bỏ khoảng trắng : ");
		a = a.trim().replaceAll("[\\s]+", " ");
		System.out.println(a);
		
		char[] s1 = a.toCharArray();
		for (int i =0; i< s1.length; i++) {
			s1[i]= Character.toLowerCase(s1[i]);
		}
		
		a = String.valueOf(s1);
		System.out.print("chuỗi in thường : ");
		System.out.println(a);
		
		String[] r = a.split("\\s");
		for (int i= 0; i< r.length; i++) {
			char[] tmp = r[i].toCharArray();
			tmp[0]= Character.toUpperCase(tmp[0]);
			r[i] = String.valueOf(tmp);	
		}
		
		String result ="";
		for (String s: r) {
			result = result + s +" ";
		}
		
		System.out.print("chuỗi kết quả : ");
		System.out.println(result);
	}

}

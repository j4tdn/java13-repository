package ex06;

public class Ex06 {
 //123456789 10111213141516171819 2021 so 24 =1
	public static void main(String[] args) {
		String a = "123456789101112131415161718192021";
		char[] c = a.toCharArray();

		System.out.println(c[32]);
		System.out.println(task(33));
		
		System.out.println(c[16]);
		System.out.println(task(17));
		
		System.out.println(task(100));
		
		//33-9= 24/10 = 2 du 4
		//		le
	}
	
	private static int task(int a) {
		int r= 0;
		if(a<=9) {r=a;}
		else {
			int y = (a-9)%10;
			if (y%2!=0) {
				r=(a-9)/10;
			}else {
				r= y/2 -1;
			}
		}
		return r;
	}
}

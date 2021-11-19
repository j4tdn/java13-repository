package ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ABCEDEABC";
		String s3 = "ABCEDEABCEDC";
		String s2 = "ABCEDCBBCK";
		
		test(s1,s2);
		test(s3,s2);
		test(s1,s3);
	}
	
	private static void test(String s1, String s2) {
		
		String kq="";
		int max= 0;
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		int st1 =0;
		int st2 =0;
		
		for (int i= 0; i< a.length; i++ ) {
			for (int t=0; t< b.length; t++) {
				if (a[i] == b[t]) {

					int dem = 0;
					st1=i;
					st2=t;
					String r ="";
					
					while (a[st1] == b[st2]) {
						
						r= r+a[st1];
						st1++;
						st2++;
						dem++;
						
						if(st1== a.length || st2 ==b.length) {
							break;
						}
					}
					if (dem > max) {
						max = dem;
						kq = r;
					}
					break;
				}
			}
		}
		System.out.println("chuoi can tim " + kq );
	}

}
